package com.project1.test.model;

// Clase para elaborar entidad Proveedores 

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;

@Data
@Entity
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Producto",unique= true, nullable = false)
    private Integer ID_Producto;
    
    @Column(nullable = false, length= 15, unique= true)
    private String Nombre;
    
    @Column(nullable = false)
    private String Descripcion;
    
    @Column(nullable = false)
    private BigDecimal Precio;
    
    @Column(nullable = false)
    private Integer Stock;
    
    @Column
    private LocalDateTime Fecha_ingreso;
    
}