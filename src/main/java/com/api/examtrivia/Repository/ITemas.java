package com.api.examtrivia.Repository;

import com.api.examtrivia.Entity.Temas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemas extends JpaRepository<Temas,Integer> {
}
