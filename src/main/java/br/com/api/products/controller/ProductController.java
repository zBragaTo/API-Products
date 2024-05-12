package br.com.api.products.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.products.models.ProductModel;
import br.com.api.products.service.ProductService;
import br.com.api.products.models.AnswerModel;

@RestController
public class ProductController {
    
    @Autowired
    private ProductService ps;

    @DeleteMapping("/remover/{id}")
    public ResponseEntity<AnswerModel> remover(@PathVariable Long id){
        return ps.remover(id);
    }

    @PutMapping("/alterar")
    public ResponseEntity<?> alterar(@RequestBody ProductModel pm){
        return ps.cadastrarAlterar(pm, "alterar");
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody ProductModel pm){
        return ps.cadastrarAlterar(pm, "cadastrar");
    }


    @GetMapping("/listar")
    public Iterable<ProductModel> listar(){
        return ps.listar();
    }

}
