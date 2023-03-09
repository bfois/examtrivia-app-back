package com.api.examtrivia.Service;


import com.api.examtrivia.Entity.Materia;

import com.api.examtrivia.Repository.IMateria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImplMateriaService implements MateriaService {
    @Autowired
    private IMateria iMateria;
    @Override
    public List<Materia> listAll() {
        return iMateria.findAll();
    }

    @Override
    public Optional<Materia> ListById(int id) {
        return iMateria.findById(id);
    }
}
