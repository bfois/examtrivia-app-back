package com.api.examtrivia.Service;

import com.api.examtrivia.Entity.Pregunta;
import com.api.examtrivia.Repository.IPregunta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImplPreguntaService implements PreguntaService{
    @Autowired
    private IPregunta iPregunta;
    @Override
    public List<Pregunta> listAll() {
        return iPregunta.findAll();
    }

    @Override
    public Optional<Pregunta> ListById(int id) {
        return iPregunta.findById(id);
    }
}
