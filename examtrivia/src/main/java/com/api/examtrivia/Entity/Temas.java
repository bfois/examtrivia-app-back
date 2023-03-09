package com.api.examtrivia.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
public class Temas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String name;

    @ManyToOne
    @JoinColumn(name = "materia_id")
    private Materia materia;

    @OneToMany(mappedBy = "temas", cascade = CascadeType.ALL)
    private List<Pregunta> preguntas;

    public Temas() {
    }

    public Temas(int id, String name, Materia materia) {
        this.id = id;
        this.name = name;
        this.materia = materia;
    }
}
