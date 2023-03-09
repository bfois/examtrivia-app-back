package com.api.examtrivia.Service;

import com.api.examtrivia.Entity.Temas;

import java.util.List;
import java.util.Optional;

public interface TemasService {

    List<Temas> listAll();
    Optional<Temas> listById(int id);
}
