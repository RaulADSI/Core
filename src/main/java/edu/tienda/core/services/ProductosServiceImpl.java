package edu.tienda.core.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import edu.tienda.core.domain.Producto;

@Service("MEMORY")
@ConditionalOnProperty(
    value = "productos.estrategia",
    havingValue = "EN_MEMORIA"
)
public class ProductosServiceImpl implements ProductoService{

    private List<Producto> productos = new ArrayList<>(Arrays.asList(
        new Producto(1, "Smart TV", 9000.0, 3),
        new Producto(2, "Note Book", 19000.0, 10),
        new Producto(3, "Smart TV", 7000.0, 5)
    ));

    public List<Producto> getProductos(){
        return productos;
    }
}
