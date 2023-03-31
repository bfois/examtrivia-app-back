package com.api.examtrivia.Controller;

import com.api.examtrivia.Entity.PreguntaRespuesta;
import com.api.examtrivia.Service.PreguntaRespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/preguntasrepuestas")
@CrossOrigin(origins = "https://polinomicos.com")
public class PreguntaRespuestaController {
    @Autowired
    private PreguntaRespuestaService preguntaRespuestaService;


    @GetMapping
    public ResponseEntity<?> listAll(){
        List<PreguntaRespuesta> preguntaRespuestas = preguntaRespuestaService.listAll();
        return ResponseEntity.ok(preguntaRespuestas);
    }
}
