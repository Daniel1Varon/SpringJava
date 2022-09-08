package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRespository extends CrudRepository<Producto,Long> {
    //@Query(value = "select * from productos where id_categoria=?", nativeQuery = true)
    List<Producto> findByCategoria_Descripcion(String descripcion);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(Integer cantidadStock, Boolean estado);



}
