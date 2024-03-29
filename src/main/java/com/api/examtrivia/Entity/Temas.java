package com.api.examtrivia.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
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
    @JsonIgnore
    private List<Pregunta> preguntas;

    public Temas() {
    }

    public Temas(int id, String name, Materia materia) {
        this.id = id;
        this.name = name;
        this.materia = materia;
    }
}
