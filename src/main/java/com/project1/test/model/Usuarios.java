
package com.project1.test.model;

// Clase para elaborar entidad Proveedores 

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_usuario",unique=true, nullable = false)
    private Integer ID_usuario;
    
    @Column
    private String Usuario;
    
    @Column
    private String Email;
    
    @Column
    private String Password;
    
}
