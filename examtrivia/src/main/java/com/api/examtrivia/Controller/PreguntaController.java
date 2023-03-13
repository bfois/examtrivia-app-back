package com.api.examtrivia.Controller;

import com.api.examtrivia.Entity.*;
import com.api.examtrivia.Service.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
@CrossOrigin(origins = "http://localhost:4200/")
public class PreguntaController {
    @Autowired
    private PreguntaService preguntaService;

    @GetMapping("/preguntas")
    public ResponseEntity<?> listAll(){
        List<Pregunta> preguntas = preguntaService.listAll();
        return ResponseEntity.ok(preguntas);
    }

    @GetMapping("/pregunta/{id}/respuestas")
    private ResponseEntity<?> listRespuestasByPreguntaId(@PathVariable("id") int id) {
        Optional<Pregunta> pregunta = preguntaService.listById(id);
        if (pregunta.isPresent()) {
            List<PreguntaRespuesta> respuestas = pregunta.get().getPreguntaRespuestas();
            return ResponseEntity.ok(respuestas);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
