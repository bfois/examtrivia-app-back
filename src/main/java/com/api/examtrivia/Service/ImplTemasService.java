package com.api.examtrivia.Service;

import com.api.examtrivia.Entity.Temas;
import com.api.examtrivia.Repository.ITemas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImplTemasService implements TemasService{

    @Autowired
    private ITemas iTemas;

    @Override
    public List<Temas> listAll() {
        return iTemas.findAll();
    }

    @Override
    public Optional<Temas> listById(int id) {
        return iTemas.findById(id);
    }

    @Override
    public List<Temas> listByIds(List<Integer> ids) {
            return iTemas.findAllById(ids);
    }

}
