package com.project1.test.repository;

// Repositoio de Proveedores

import com.project1.test.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuariosRepository extends JpaRepository<Usuarios, Integer> {
    
}
