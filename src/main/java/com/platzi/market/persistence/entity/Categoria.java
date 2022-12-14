package com.platzi.market.persistence.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@Table(name = "categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria", nullable = false)
    private Long idCategoria;
    private String descripcion;
    private Boolean estado;
    @OneToMany(mappedBy ="categoria")
    private List<Producto> productos;

}
