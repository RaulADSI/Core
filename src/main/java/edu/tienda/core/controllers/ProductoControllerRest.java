package edu.tienda.core.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.tienda.core.configurations.ConfigurationsParameters;
import edu.tienda.core.domain.Producto;
import edu.tienda.core.services.ProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoControllerRest {

    //Instanciamos la clase de servicio con "Java puro"
    @Autowired
    @Lazy
    private ProductoService productoService;

    @Autowired
    private ConfigurationsParameters configurationsParameters;

    private ProductoService productosService;

    @GetMapping
    public ResponseEntity<?> getProductos(){

        System.out.println("params:" + configurationsParameters.toString());
        List<Producto> productos = productosService.getProductos();
        return ResponseEntity.ok(productos);
    }
}
