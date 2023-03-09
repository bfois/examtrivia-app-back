package com.api.examtrivia.Controller;

import com.api.examtrivia.Entity.Temas;
import com.api.examtrivia.Service.MateriaService;
import com.api.examtrivia.Service.TemasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class TemasController {

    @Autowired
    private TemasService temasService;

    @GetMapping("/temas")
    public ResponseEntity<?> listAll(){
        List<Temas> temas = temasService.listAll();
        return ResponseEntity.ok(temas);
    }
}
