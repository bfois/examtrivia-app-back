package com.api.examtrivia.Service;

import com.api.examtrivia.Entity.Materia;



import java.util.List;
import java.util.Optional;


public interface MateriaService {

    List<Materia> listAll();
    Optional<Materia> ListById(int id);

}
