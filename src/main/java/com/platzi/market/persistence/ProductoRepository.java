package com.platzi.market.persistence;

import com.platzi.market.domain.Product;
import com.platzi.market.domain.repository.ProductRepository;
import com.platzi.market.persistence.crud.ProductoCrudRespository;
import com.platzi.market.persistence.entity.Producto;
import com.platzi.market.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository implements ProductRepository {
    @Autowired
    private ProductoCrudRespository productoCrudRespository;
    @Autowired
    private ProductMapper mapper;

    @Override
    public List<Product> getAll(){
        List<Producto> productos= (List<Producto>) productoCrudRespository.findAll();
        return mapper.toProducts(productos);
    }
    @Override
    public Optional<List<Product>> getByCategory(String categoria){
        List<Producto> productos= productoCrudRespository.findByCategoria_Descripcion(categoria);
        return Optional.of(mapper.toProducts(productos));
    }
    @Override
    public Optional<List<Product>> getScarseProducts(int cantidad){
        Optional<List<Producto>> productos=productoCrudRespository.findByCantidadStockLessThanAndEstado(cantidad,true);
        return productos.map(mapper::toProducts);
    }
    @Override
    public Optional<Product> getProduct(long id){
        return productoCrudRespository.findById(id).map(mapper::toProduct);
    }
    @Override
    public Product save(Product product){
        return mapper.toProduct(productoCrudRespository.save(mapper.toProducto(product)));
    }
    @Override
    public void delete(long id){
        productoCrudRespository.deleteById(id);
    }
}
