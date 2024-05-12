package br.com.api.products.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.api.products.models.ProductModel;

public interface ProductRepository  extends CrudRepository<ProductModel, Long>{
    
}
