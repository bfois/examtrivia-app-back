package com.api.examtrivia.Repository;

import com.api.examtrivia.Entity.Disciplina;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDisciplina extends JpaRepository<Disciplina, Integer> {
}
