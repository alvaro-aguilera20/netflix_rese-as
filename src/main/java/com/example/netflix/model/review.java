package com.example.netflix.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "reviews")
public class review {

    @Id
    private String id; // ID propio de la reseña (autogenerado por Mongo)

    private String productoId; // <-- Aquí guardas el ID del ProductoAudioVisual al que pertenece

    private String usuario; // Quién escribe la reseña (ej: "juan_perez")
    
    private int calificacion; // 1 o 2 para positiva, 0 neutra y -1 para negativa
    
    private String comentario;
}