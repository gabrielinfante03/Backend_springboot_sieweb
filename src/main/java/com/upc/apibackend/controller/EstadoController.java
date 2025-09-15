package com.upc.apibackend.controller;

import com.upc.apibackend.model.Estado;
import com.upc.apibackend.service.EstadoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class EstadoController {
    final EstadoService estadoService;

    public EstadoController(EstadoService estadoService) {
        this.estadoService = estadoService;
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Estado>> listar(){
        return ResponseEntity.ok(estadoService.listar());
    }

    @PostMapping("/registrar")
    public ResponseEntity<Estado> registrar(@RequestBody Estado estado) {
        return ResponseEntity.ok(estadoService.registrar(estado));
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        estadoService.eliminar(id);
    }
}
