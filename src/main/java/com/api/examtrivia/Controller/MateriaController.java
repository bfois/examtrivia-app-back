package com.api.examtrivia.Controller;


import com.api.examtrivia.Entity.Materia;

import com.api.examtrivia.Entity.Temas;
import com.api.examtrivia.Service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/home")
@CrossOrigin(origins = {"https://polinomicos.com", "http://localhost:4200"})
public class MateriaController {

    @Autowired
    private MateriaService materiaService;

    @GetMapping("/materias")
    public ResponseEntity<?> listAll(){
        List<Materia> materias = materiaService.listAll();
        return ResponseEntity.ok(materias);
    }
    @GetMapping("/materias/{id}/temas")
    private ResponseEntity<?> listTemasByMateriaId(@PathVariable("id") int id) {
        Optional<Materia> materia = materiaService.listById(id);
        if (materia.isPresent()) {
            List<Temas> temas = materia.get().getTemas();
            return ResponseEntity.ok(temas);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
