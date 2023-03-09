package com.api.examtrivia.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Pregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String enunciado;

    @OneToMany(mappedBy = "pregunta")
    private List<PreguntaRespuesta> preguntaRespuestas;

    public Pregunta() {
    }

    public Pregunta(Long id, String enunciado, List<PreguntaRespuesta> preguntaRespuestas) {
        this.id = id;
        this.enunciado = enunciado;
        this.preguntaRespuestas = preguntaRespuestas;
    }
}
