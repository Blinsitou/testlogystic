package com.project1.test.services;

//Servicios CRUD Proveedores

import com.project1.test.model.Usuarios;



public interface UsuariosServices {
    Usuarios newUsuario (Usuarios newUsuario);
    Iterable<Usuarios> getAll();
    Usuarios modifyUsuario (Usuarios usuario);
    Boolean deleteUsuario (Integer ID_Usuario);
    
}
