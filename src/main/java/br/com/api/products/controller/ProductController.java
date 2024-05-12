package br.com.api.products.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.products.models.ProductModel;
import br.com.api.products.service.ProductService;

@RestController
public class ProductController {
    
    @Autowired
    private ProductService ps;

    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody ProductModel pm){
        return ps.cadastrar(pm);
    }


    @GetMapping("/listar")
    public Iterable<ProductModel> listar(){
        return ps.listar();
    }

}
