package com.example.netflix.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "productoAudioVisual")
public class productoAudioVisual {
    @Id
    private Long id;

    private String titulo;

    private String descripcion;

    private String tipo;

    private int duracionMinutos;

    private String publico;

    private int anyoEstreno;
}
