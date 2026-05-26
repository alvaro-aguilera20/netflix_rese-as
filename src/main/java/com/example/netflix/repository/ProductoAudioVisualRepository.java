package com.example.netflix.repository;

import com.example.netflix.model.productoAudioVisual;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoAudioVisualRepository extends MongoRepository<productoAudioVisual, String> {
    // Al heredar de MongoRepository, ya tienes métodos como save(), findById(), deleteById(), etc.
}