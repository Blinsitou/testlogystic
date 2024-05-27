package com.project1.test.model;

//
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Proveedores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Proveedor",unique=true, nullable = false)
    private Integer ID_Proveedor;
    
    @Column
    private String Nombre;
    
    @Column
    private String Direccion;
    
    @Column
    private String Telefono;
    
    @Column
    private String Email;
    
}