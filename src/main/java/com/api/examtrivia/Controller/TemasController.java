package com.api.examtrivia.Controller;

import com.api.examtrivia.Entity.Pregunta;
import com.api.examtrivia.Entity.Temas;

import com.api.examtrivia.Service.TemasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
@CrossOrigin(origins = "https://polinomicos.com")
public class TemasController {

    @Autowired
    private TemasService temasService;

    @GetMapping("/temas")
    public ResponseEntity<?> listAll(){
        List<Temas> temas = temasService.listAll();
        return ResponseEntity.ok(temas);
    }

    @GetMapping("/temas/{ids}/preguntas")
    private ResponseEntity<?> listPreguntasByTema(@PathVariable("ids") List<Integer> ids,
                                                  @RequestParam(defaultValue = "20") Integer size,
                                                  @RequestParam(defaultValue = "0") Integer startIndex) {
        List<Temas> temas = temasService.listByIds(ids);
        List<Pregunta> preguntas = new ArrayList<>();
        for (Temas tema : temas) {
            preguntas.addAll(tema.getPreguntas());
        }
        int adjustedStartIndex = startIndex * size;
        int endIndex = Math.min(adjustedStartIndex + size, preguntas.size());
        List<Pregunta> preguntasPaginadas = preguntas.subList(adjustedStartIndex, endIndex);
        return ResponseEntity.ok(preguntasPaginadas);
    }
}
