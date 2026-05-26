package com.example.netflix.controller;

import com.example.netflix.model.review;
import com.example.netflix.repository.reviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reseñas")
public class ReviewController {

    @Autowired
    private reviewRepository reviewRepository;

    // 1. Dejar una nueva reseña para un producto
    // POST http://localhost:8080/api/reseñas
    @PostMapping
    public review crearReseña(@RequestBody review nuevaReseña) {
        // Aquí recibiremos el "productoId" dentro del cuerpo JSON
        return reviewRepository.save(nuevaReseña);
    }

    // 2. Obtener todas las reseñas de un producto específico usando su ID relacionados
    // GET http://localhost:8080/api/reseñas/producto/{productoId}
    @GetMapping("/producto/{productoId}")
    public List<review> obtenerReseñasPorProducto(@PathVariable String productoId) {
        return reviewRepository.findByProductoId(productoId);
    }
}