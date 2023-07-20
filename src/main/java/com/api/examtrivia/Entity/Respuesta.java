package com.api.examtrivia.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Getter
@Setter
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String texto;

    @OneToMany(mappedBy = "respuesta")
    @JsonIgnore
    private List<PreguntaRespuesta> preguntaRespuestas;

    // Constructor, getters y setters

    public Respuesta() {
    }

    public Respuesta(Integer id, String texto, List<PreguntaRespuesta> preguntaRespuestas) {
        this.id = id;
        this.texto = texto;
        this.preguntaRespuestas = preguntaRespuestas;
    }
}
