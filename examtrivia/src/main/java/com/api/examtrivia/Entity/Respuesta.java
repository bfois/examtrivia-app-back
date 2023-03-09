package com.api.examtrivia.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String texto;

    @OneToMany(mappedBy = "respuesta")
    private List<PreguntaRespuesta> preguntaRespuestas;

    // Constructor, getters y setters

    public Respuesta() {
    }

    public Respuesta(Long id, String texto, List<PreguntaRespuesta> preguntaRespuestas) {
        this.id = id;
        this.texto = texto;
        this.preguntaRespuestas = preguntaRespuestas;
    }
}
