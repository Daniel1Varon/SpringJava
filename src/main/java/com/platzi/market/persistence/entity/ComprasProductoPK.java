package com.platzi.market.persistence.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@ToString
public class ComprasProductoPK implements Serializable {

    @Column(name = "id_compra")
    private Long idCompra;
    @Column(name = "id_producto")
    private Long idProducto;
}
