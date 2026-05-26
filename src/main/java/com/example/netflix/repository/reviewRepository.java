package com.example.netflix.repository;

import com.example.netflix.model.review; // Asumiendo que cambiaste la 'r' a mayúscula
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface reviewRepository extends MongoRepository<review, String> {
    
    // Este método es clave: Spring Data entenderá automáticamente que quieres 
    // buscar todas las reseñas que coincidan con un "productoId" específico.
    List<review> findByProductoId(String productoId);
}