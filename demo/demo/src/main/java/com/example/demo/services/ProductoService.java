package com.example.demo.services;

import com.example.demo.models.Producto;
import com.example.demo.repositories.ProductoRepository;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class ProductoService {
    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @PostMapping("/producto")
    @ResponseBody
    public Producto crear(@RequestBody Producto producto){
        Producto resultado = productoRepository.crear(producto);
        return resultado;
    }
}
