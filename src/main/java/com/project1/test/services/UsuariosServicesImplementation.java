package com.project1.test.services;

// Implementacion de Proveedores

import com.project1.test.model.Usuarios;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project1.test.repository.UsuariosRepository;

@Service
public class UsuariosServicesImplementation implements UsuariosServices{
    
    @Autowired
    private UsuariosRepository usuariosRepository;
    
    @Override
    public Usuarios newUsuario(Usuarios newProveedor) {
        return usuariosRepository.save(newProveedor);
    }

    @Override
    public Iterable<Usuarios> getAll() {
        return this.usuariosRepository.findAll();
    }

    @Override
    public Usuarios modifyUsuario(Usuarios usuario) {
        Optional<Usuarios> usuarioEncontrado = this.usuariosRepository.findById(usuario.getID_usuario());
        if (usuarioEncontrado.isPresent()) {
            Usuarios usuarioExistente = usuarioEncontrado.get();
            usuarioExistente.setUsuario(usuario.getUsuario());
            usuarioExistente.setEmail(usuario.getEmail());
            usuarioExistente.setPassword(usuario.getPassword());

            return this.usuariosRepository.save(usuarioExistente);
        }
        return null;
    }

    @Override
    public Boolean deleteUsuario(Integer ID_usuario) {
        this.usuariosRepository.deleteById(ID_usuario);
        return true;
    }
    
    
}
