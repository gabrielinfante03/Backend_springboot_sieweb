package com.upc.apibackend.service;

import com.upc.apibackend.model.Estado;
import com.upc.apibackend.repository.EstadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService {
    final EstadoRepository estadoRepository;

    public EstadoService(EstadoRepository estadoRepository) {
        this.estadoRepository = estadoRepository;
    }

    public List<Estado> listar() {
        return estadoRepository.findAll();
    }

    public Estado registrar(Estado estado) {
        return estadoRepository.save(estado);
    }
    public void eliminar(Long id) {
        estadoRepository.deleteById(id);
    }
}
