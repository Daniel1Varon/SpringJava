package com.platzi.market.domain.service;

import com.platzi.market.domain.Product;
import com.platzi.market.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll(){
        return productRepository.getAll();
    }

    public Optional<Product> getProduct(long id){
        return productRepository.getProduct(id);
    }

    public Optional<List<Product>> getByCategory(String category){
        return productRepository.getByCategory(category);
    }

    public Product save(Product product){
        return productRepository.save(product);
    }

    public boolean delete(long id){
        return getProduct(id).map(prod-> {
            productRepository.delete(id);
            return true;
        }).orElse(false);
    }
}
