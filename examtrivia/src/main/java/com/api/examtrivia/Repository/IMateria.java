package com.api.examtrivia.Repository;

import com.api.examtrivia.Entity.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMateria extends JpaRepository<Materia,Integer> {
}
