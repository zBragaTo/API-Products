package br.com.api.products.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.api.products.models.AnswerModel;
import br.com.api.products.models.ProductModel;
import br.com.api.products.repositories.ProductRepository;

@Service
public class ProductService {
  
    @Autowired
    private ProductRepository pr;

    @Autowired
    private AnswerModel rm;

    public  Iterable<ProductModel> listar(){
        return pr.findAll();
    }

    public ResponseEntity<?> cadastrarAlterar(ProductModel pm, String action){
        if(pm.getName().equals("")){
            rm.setMensagem("Nome do PRODUTO é OBRIGATÓRIO!");
            return new ResponseEntity<AnswerModel>(rm, HttpStatus.BAD_REQUEST);
        } else if(pm.getBrand().equals("")){
            rm.setMensagem("Nome da MARCA é OBRIGATÓRIO!");
            return new ResponseEntity<AnswerModel>(rm, HttpStatus.BAD_REQUEST);
        } else {
            if(action.equals("cadastrar")){
                return new ResponseEntity<ProductModel>(pr.save(pm), HttpStatus.CREATED);
            } else {
                return new ResponseEntity<ProductModel>(pr.save(pm), HttpStatus.OK);
            }
        }

    }
}
