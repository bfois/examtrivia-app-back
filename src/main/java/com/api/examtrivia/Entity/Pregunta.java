package com.api.examtrivia.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Pregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String enunciado;

    private String ImgURL;

    @OneToMany(mappedBy = "pregunta")
    @JsonIgnore
    private List<PreguntaRespuesta> preguntaRespuestas;

    @ManyToOne
    @JoinColumn(name = "temas_id")
    private Temas temas;

    public Pregunta() {
    }

    public Pregunta(Integer id, String enunciado, List<PreguntaRespuesta> preguntaRespuestas) {
        this.id = id;
        this.enunciado = enunciado;
        this.preguntaRespuestas = preguntaRespuestas;
    }
}
