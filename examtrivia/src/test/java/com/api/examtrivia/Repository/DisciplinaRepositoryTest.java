package com.api.examtrivia.Repository;

import com.api.examtrivia.Entity.Disciplina;

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
public class DisciplinaRepositoryTest {

    @Autowired
    private IDisciplina iDisciplina;

    private Disciplina disciplina;
    private Disciplina disciplina1;

    @BeforeEach
    public void setUp() {
        // Crea dos disciplinas para usar en las pruebas
        disciplina = Disciplina.builder().name("Matematica").build();
        disciplina1 = Disciplina.builder().name("Medicina").build();

        // Guarda las disciplinas en la base de datos
        iDisciplina.save(disciplina);
        iDisciplina.save(disciplina1);
    }

    @AfterEach
    public void tearDown() {
        // Borra las disciplinas de la base de datos para que no afecten a otras pruebas
        iDisciplina.deleteAll();
    }

    @Test
    public void DisciplinaRepository_ListAll_returnsListDisciplinas() {

        // Act
        List<Disciplina> disciplinas = iDisciplina.findAll();

        // Assert
        Assertions.assertThat(disciplinas).isNotNull();
        Assertions.assertThat(disciplinas).hasSize(2);
        Assertions.assertThat(disciplinas).containsExactlyInAnyOrder(disciplina, disciplina1);
    }

    @Test
    public void DisciplinaRepository_SaveNewDisciplina_ReturnsDisciplina() {

        // Arrange
        Disciplina newDisciplina = Disciplina.builder().name("Quimica").build();

        // Act
        Disciplina savedDisciplina = iDisciplina.save(newDisciplina);

        // Assert
        Assertions.assertThat(savedDisciplina).isNotNull();
        Assertions.assertThat(savedDisciplina.getId()).isNotNull();
        Assertions.assertThat(savedDisciplina.getName()).isEqualTo(newDisciplina.getName());
    }

}
