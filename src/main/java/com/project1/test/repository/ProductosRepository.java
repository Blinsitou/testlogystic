package com.project1.test.repository;

// Repositoio de Proveedores

import com.project1.test.model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductosRepository extends JpaRepository<Productos, Integer> {
    
}
