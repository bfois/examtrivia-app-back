package com.api.examtrivia.Controller;

import com.api.examtrivia.Entity.Materia;

import com.api.examtrivia.Service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@CrossOrigin("http://localhost:4200/")
public class MateriaController {

    @Autowired
    private MateriaService materiaService;

    @GetMapping("/materias")
    public ResponseEntity<?> listAll(){
        List<Materia> materias = materiaService.listAll();
        return ResponseEntity.ok(materias);
    }

}
