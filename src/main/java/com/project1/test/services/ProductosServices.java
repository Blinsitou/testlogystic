package com.project1.test.services;

//Servicios CRUD Proveedores

import com.project1.test.model.Productos;



public interface ProductosServices {
    Productos newProducto(Productos newProducto);
    Iterable<Productos> getAll();
    Productos modifyProducto (Productos producto);
    Boolean deleteProducto (Integer ID_Producto);
    
}
