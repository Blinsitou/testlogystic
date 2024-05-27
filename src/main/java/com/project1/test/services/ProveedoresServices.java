package com.project1.test.services;

//Servicios CRUD Proveedores

import com.project1.test.model.Proveedores;



public interface ProveedoresServices {
    Proveedores newProveedor(Proveedores newProveedor);
    Iterable<Proveedores> getAll();
    Proveedores modifyProveedor (Proveedores proveedor);
    Boolean deleteProveedor (Integer ID_Proveedor);
    
}

