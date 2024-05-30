package edu.tienda.core.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.Optional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import edu.tienda.core.domain.Producto;
import lombok.extern.slf4j.Slf4j;

@Lazy
@Slf4j
@Service("MEMORY")
@ConditionalOnProperty(value = "productos.estrategia", havingValue = "EN_MEMORIA")
public class ProductosServiceImpl implements ProductoService {

    private List<Producto> productos = new ArrayList<>(Arrays.asList(
            new Producto(1, "Smart TV", 9000.0, 3),
            new Producto(2, "PC Note Book", 19000.0, 10),
            new Producto(3, "Tablet", 7000.0, 5)));

    public ProductosServiceImpl() {
        log.info("Se esta construyendo un objeto de la clase ProductosServiceImpl.");
    }

    public List<Producto> getProductos() {
        return productos;
    }

    @Override
    public void saveProducto(Producto producto){
        
    }
}
