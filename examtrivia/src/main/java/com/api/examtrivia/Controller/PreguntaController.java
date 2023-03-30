package com.api.examtrivia.Controller;

import com.api.examtrivia.Entity.*;
import com.api.examtrivia.Service.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
@CrossOrigin("https://polinomicos.com/")
public class PreguntaController {
    @Autowired
    private PreguntaService preguntaService;

    @GetMapping("/preguntas")
    public ResponseEntity<?> listAll(){
        List<Pregunta> preguntas = preguntaService.listAll();
        return ResponseEntity.ok(preguntas);
    }

    @GetMapping("/pregunta/{ids}/respuestas")
    private ResponseEntity<?> listRespuestasByPreguntaId(@PathVariable("ids")  List<Integer> ids) {
        List<Pregunta> preguntas = preguntaService.listByIds(ids);
        List<PreguntaRespuesta> respuestas = new ArrayList<>();
        for (Pregunta pregunta : preguntas) {
            respuestas.addAll(pregunta.getPreguntaRespuestas());
        }
        return ResponseEntity.ok(respuestas);
    }

}
