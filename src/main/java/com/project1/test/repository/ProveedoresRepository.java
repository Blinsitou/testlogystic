package com.project1.test.repository;

// Repositorio de Proveedores

import com.project1.test.model.Proveedores;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProveedoresRepository extends JpaRepository<Proveedores, Integer> {
    
}
