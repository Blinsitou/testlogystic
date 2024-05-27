package com.project1.test.services;

// Implementacion de Proveedores

import com.project1.test.model.Productos;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project1.test.repository.ProductosRepository;
import java.time.LocalDateTime;

@Service
public class ProductosServicesImpl implements ProductosServices{
    
    @Autowired
    private ProductosRepository productosRepository;
    
    @Override
    public Productos newProducto(Productos newProducto) {
        newProducto.setFecha_ingreso(LocalDateTime.now());
        return productosRepository.save(newProducto);
    }

    @Override
    public Iterable<Productos> getAll() {
        return this.productosRepository.findAll();
    }

    @Override
    public Productos modifyProducto(Productos producto) {
        Optional<Productos> productoEncontrado = this.productosRepository.findById(producto.getID_Producto());
        if (productoEncontrado.isPresent()) {
            Productos productoExistente = productoEncontrado.get();
            productoExistente.setNombre(producto.getNombre());
            productoExistente.setDescripcion(producto.getDescripcion());
            productoExistente.setPrecio(producto.getPrecio());
            productoExistente.setStock(producto.getStock());
            //productoExistente.setFecha_ingreso(producto.getFecha_ingreso());
            LocalDateTime fechaIngresoActual = productoExistente.getFecha_ingreso();
            productoExistente.setFecha_ingreso(fechaIngresoActual);
            
            return this.productosRepository.save(productoExistente);
        }
        return null;
    }

    @Override
    public Boolean deleteProducto(Integer ID_Producto) {
        this.productosRepository.deleteById(ID_Producto);
        return true;
    }
    
    
}