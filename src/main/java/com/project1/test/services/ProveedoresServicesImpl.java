package com.project1.test.services;

// Implementacion de Proveedores

import com.project1.test.model.Proveedores;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project1.test.repository.ProveedoresRepository;

@Service
public class ProveedoresServicesImpl implements ProveedoresServices{
    
    @Autowired
    private ProveedoresRepository proveedoresRepository;
    
    @Override
    public Proveedores newProveedor(Proveedores newProveedor) {
        return proveedoresRepository.save(newProveedor);
    }

    @Override
    public Iterable<Proveedores> getAll() {
        return this.proveedoresRepository.findAll();
    }

    @Override
    public Proveedores modifyProveedor(Proveedores proveedor) {
        Optional<Proveedores> proveedorEncontrado = this.proveedoresRepository.findById(proveedor.getID_Proveedor());
        if (proveedorEncontrado.isPresent()) {
            Proveedores proveedorExistente = proveedorEncontrado.get();
            proveedorExistente.setNombre(proveedor.getNombre());
            proveedorExistente.setEmail(proveedor.getDireccion());
            proveedorExistente.setTelefono(proveedor.getTelefono());
            proveedorExistente.setEmail(proveedor.getEmail());

            return this.proveedoresRepository.save(proveedorExistente);
        }
        return null;
    }

    @Override
    public Boolean deleteProveedor(Integer ID_Proveedor) {
        this.proveedoresRepository.deleteById(ID_Proveedor);
        return true;
    }
    
    
}
