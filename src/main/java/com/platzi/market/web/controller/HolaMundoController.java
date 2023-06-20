package com.platzi.market.web.controller;

import com.platzi.market.persistence.ProductoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HolaMundoController {

    @GetMapping("/hola")
    public String saludar(){
        return "Nunca Pares de Aprender! 😍";
    }

    @GetMapping("/productos")
    public String getProductos(){
        ProductoRepository producto = new ProductoRepository();
        return producto.getAll().toString();
    }
}
