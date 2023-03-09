package com.api.examtrivia.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PreguntaRespuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pregunta_id")
    private Pregunta pregunta;

    @ManyToOne
    @JoinColumn(name = "respuesta_id")
    private Respuesta respuesta;

    private Boolean esVerdadera;

    public PreguntaRespuesta(Long id, Pregunta pregunta, Respuesta respuesta, Boolean esVerdadera) {
        this.id = id;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.esVerdadera = esVerdadera;
    }

    public PreguntaRespuesta() {
    }
}
