package edu.tienda.core.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productos")
public class ProductoControllerRest {

    @GetMapping
    public ResponseEntity<?> getProductos(){
        return ResponseEntity.ok(null);
    }
}
