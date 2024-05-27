package com.project1.test.controller;

//

import com.project1.test.model.Proveedores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project1.test.services.ProveedoresServices;

@RestController
@RequestMapping("/proveedores")
public class ProveedoresController {
    
    @Autowired
    private ProveedoresServices proveedoresServices;
    
    @PostMapping("/nuevo")
    public Proveedores newProveedor(@RequestBody Proveedores newProveedor){
        return this.proveedoresServices.newProveedor(newProveedor);
    }
    
    @GetMapping("/mostrar")
    public Iterable<Proveedores> getAll(){
        return proveedoresServices.getAll();
    }
    
    @PostMapping("/modificar")
    public Proveedores updateProveedor(@RequestBody Proveedores proveedor){
        return this.proveedoresServices.modifyProveedor(proveedor);
    }
    
    @PostMapping("/{id}")
    public Boolean deleteProveedor(@PathVariable(value="id") Integer id) {
        return this.proveedoresServices.deleteProveedor(id);
    }
    
}
