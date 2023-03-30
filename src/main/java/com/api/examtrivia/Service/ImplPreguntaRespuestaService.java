package com.api.examtrivia.Service;

import com.api.examtrivia.Entity.PreguntaRespuesta;
import com.api.examtrivia.Repository.IPreguntaRespuesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImplPreguntaRespuestaService implements PreguntaRespuestaService{

    @Autowired
    private IPreguntaRespuesta iPreguntaRespuesta;
    @Override
    public List<PreguntaRespuesta> listAll() {
        return iPreguntaRespuesta.findAll();
    }

    @Override
    public Optional<PreguntaRespuesta> ListById(int id) {
        return iPreguntaRespuesta.findById(id);
    }
}
