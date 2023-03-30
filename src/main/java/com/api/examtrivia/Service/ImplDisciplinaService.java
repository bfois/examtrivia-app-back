package com.api.examtrivia.Service;

import com.api.examtrivia.Entity.Disciplina;

import com.api.examtrivia.Repository.IDisciplina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImplDisciplinaService implements DisciplinaService {

    @Autowired
    private IDisciplina iDisciplina;
    @Override
    public List<Disciplina> listAll() {
        return iDisciplina.findAll();
    }

    @Override
    public Optional<Disciplina> listById(int id) {
        return iDisciplina.findById(id);
    }
}
