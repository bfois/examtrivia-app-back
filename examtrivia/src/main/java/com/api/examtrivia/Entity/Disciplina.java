package com.api.examtrivia.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String name;

    @OneToMany(mappedBy = "disciplina", cascade = CascadeType.ALL)
    private List<Materia> materias;

    public Disciplina() {

    }

    public Disciplina(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
