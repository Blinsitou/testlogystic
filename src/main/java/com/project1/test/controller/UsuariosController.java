package com.project1.test.controller;

//

import com.project1.test.model.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project1.test.services.UsuariosServices;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
    
    @Autowired
    private UsuariosServices usuariosServices;
    
    @PostMapping("/nuevo")
    public Usuarios newUsuario(@RequestBody Usuarios newUsuario){
        return this.usuariosServices.newUsuario(newUsuario);
    }
    
    @GetMapping("/mostrar")
    public Iterable<Usuarios> getAll(){
        return usuariosServices.getAll();
    }
    
    @PostMapping("/modificar")
    public Usuarios updateUsuario(@RequestBody Usuarios usuario){
        return this.usuariosServices.modifyUsuario(usuario);
    }
    
    @PostMapping("/{id}")
    public Boolean deleteUsuario(@PathVariable(value="id") Integer id) {
        return this.usuariosServices.deleteUsuario(id);
    }
    
    
    
    
}
