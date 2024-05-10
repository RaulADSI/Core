package edu.tienda.core.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.tienda.core.domain.Producto;
import edu.tienda.core.services.ProductosServiceImpl;

@RestController
@RequestMapping("/productos")
public class ProductosControllerRest {


    private ProductosServiceImpl productoService = new ProductosServiceImpl();
    @GetMapping
    public ResponseEntity<?> getProductos(){

        List<Producto> productos = productoService.getProductos();

        return ResponseEntity.ok(productos);
    }
}
