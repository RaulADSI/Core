package edu.tienda.core.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.tienda.core.domain.Producto;

public class ProductosServiceImpl {

    private List<Producto> productos = new ArrayList<>(Arrays.asList(
        new Producto(1, "Smart TV", 9000.0, 3),
        new Producto(2, "Note Book", 19000.0, 10),
        new Producto(3, "Smart TV", 7000.0, 5)
    ));

    public List<Producto> getProductos(){
        return productos;
    }
}
