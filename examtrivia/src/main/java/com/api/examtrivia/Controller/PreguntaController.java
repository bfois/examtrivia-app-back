package com.api.examtrivia.Controller;

import com.api.examtrivia.Entity.Pregunta;
import com.api.examtrivia.Service.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
