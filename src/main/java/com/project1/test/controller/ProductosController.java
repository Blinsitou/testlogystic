package com.project1.test.controller;

//

import com.project1.test.model.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project1.test.services.ProductosServices;

@RestController
@RequestMapping("/productos")
public class ProductosController {
    
    @Autowired
    private ProductosServices productosServices;
    
    @PostMapping("/nuevo")
    public Productos newProducto(@RequestBody Productos newProducto){
        return this.productosServices.newProducto(newProducto);
    }
    
    @GetMapping("/mostrar")
    public Iterable<Productos> getAll(){
        return productosServices.getAll();
    }
    
    @PostMapping("/modificar")
    public Productos updateProducto(@RequestBody Productos producto){
        return this.productosServices.modifyProducto(producto);
    }
    
    @PostMapping("/{id}")
    public Boolean deleteProducto(@PathVariable(value="id") Integer id) {
        return this.productosServices.deleteProducto(id);
    }


}