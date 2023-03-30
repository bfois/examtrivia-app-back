package com.api.examtrivia.Controller;


import com.api.examtrivia.Entity.Respuesta;

import com.api.examtrivia.Service.RespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
@CrossOrigin(origins = {"https://polinomicos.com", "http://localhost:4200"})
public class RespuestaController {
    @Autowired
    private RespuestaService respuestaService;


    @GetMapping("/respuestas")
    public ResponseEntity<?> listAll(){
        List<Respuesta> respuestas = respuestaService.listAll();
        return ResponseEntity.ok(respuestas);
    }
}
