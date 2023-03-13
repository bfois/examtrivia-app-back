package com.api.examtrivia.Controller;

import com.api.examtrivia.Entity.Pregunta;
import com.api.examtrivia.Entity.Temas;

import com.api.examtrivia.Service.TemasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
@CrossOrigin("http://localhost:4200/")
public class TemasController {

    @Autowired
    private TemasService temasService;

    @GetMapping("/temas")
    public ResponseEntity<?> listAll(){
        List<Temas> temas = temasService.listAll();
        return ResponseEntity.ok(temas);
    }

    @GetMapping("/temas/{id}/preguntas")
    private ResponseEntity<?> listPreguntasByTema(@PathVariable("id") int id) {
        Optional<Temas> tema = temasService.listById(id);
        if (tema.isPresent()) {
            List<Pregunta> preguntas = tema.get().getPreguntas();
            return ResponseEntity.ok(preguntas);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
