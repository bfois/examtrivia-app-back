package com.api.examtrivia.Controller;


import com.api.examtrivia.Entity.Disciplina;

import com.api.examtrivia.Entity.Materia;
import com.api.examtrivia.Service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/home")
@CrossOrigin("https://polinomicos.com")
public class DisciplinaController {

    @Autowired
    private DisciplinaService disciplinaService;

    @GetMapping("/disciplinas")
    private ResponseEntity<?> listAll(){
        List<Disciplina> disciplinas = disciplinaService.listAll();
        return ResponseEntity.ok(disciplinas);
    }
    @GetMapping("/disciplinas/{id}/materias")
    private ResponseEntity<?> listMateriasByDisciplinaId(@PathVariable("id") int id) {
        Optional<Disciplina> disciplina = disciplinaService.listById(id);
        if (disciplina.isPresent()) {
            List<Materia> materias = disciplina.get().getMaterias();
            return ResponseEntity.ok(materias);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
