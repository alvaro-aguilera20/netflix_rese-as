package com.example.netflix.controller;

import com.example.netflix.model.productoAudioVisual;
import com.example.netflix.repository.ProductoAudioVisualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoAudioVisualController {

    @Autowired
    private ProductoAudioVisualRepository productoRepository;

    // 1. Crear un nuevo producto (Película o Serie)
    // POST http://localhost:8080/api/productos
    @PostMapping
    public productoAudioVisual crearProducto(@RequestBody productoAudioVisual producto) {
        return productoRepository.save(producto);
    }

    // 2. Obtener todos los productos
    // GET http://localhost:8080/api/productos
    @GetMapping
    public List<productoAudioVisual> obtenerTodos() {
        return productoRepository.findAll();
    }

    // 3. Obtener un producto específico por su ID
    // GET http://localhost:8080/api/productos/{id}
    @GetMapping("/{id}")
    public productoAudioVisual obtenerPorId(@PathVariable String id) {
        return productoRepository.findById(id).orElse(null);
    }
}