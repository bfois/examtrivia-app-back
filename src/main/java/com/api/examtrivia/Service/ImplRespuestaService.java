package com.api.examtrivia.Service;

import com.api.examtrivia.Entity.Respuesta;
import com.api.examtrivia.Repository.IRespuesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImplRespuestaService implements RespuestaService{

    @Autowired
    private IRespuesta iRespuesta;
    @Override
    public List<Respuesta> listAll() {
        return iRespuesta.findAll();
    }

    @Override
    public Optional<Respuesta> ListById(int id) {
        return iRespuesta.findById(id);
    }
}
