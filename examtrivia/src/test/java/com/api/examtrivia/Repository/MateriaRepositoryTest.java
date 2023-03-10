package com.api.examtrivia.Repository;

import com.api.examtrivia.Entity.Materia;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class MateriaRepositoryTest {
    @Autowired
    private IMateria iMateria;

    private Materia materia;
    private Materia materia1;

    @BeforeEach
    public void setUp(){
        materia = Materia.builder().name("Probabilidad").build();
        materia1 = Materia.builder().name("Algebra").build();

        materia = iMateria.save(materia);
        materia1 = iMateria.save(materia1);
    }

    @AfterEach
    public void tearDown(){
        iMateria.deleteAll();
    }

    @Test
    public void materiaRepository_listAll_returnListMaterias(){

        //Act
        List<Materia> materias = iMateria.findAll();

        //Assert
        Assertions.assertThat(materias).isNotNull();
        Assertions.assertThat(materias).hasSize(2);
    }
}
