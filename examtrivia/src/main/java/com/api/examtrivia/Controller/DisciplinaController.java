package com.api.examtrivia.Controller;


import com.api.examtrivia.Entity.Disciplina;

import com.api.examtrivia.Service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("http://localhost:4200/")
public class DisciplinaController {

    @Autowired
    private DisciplinaService disciplinaService;

    @GetMapping("/disciplinas")
    private ResponseEntity<?> listAll(){
        List<Disciplina> disciplinas = disciplinaService.listAll();
        return ResponseEntity.ok(disciplinas);
    }

}
