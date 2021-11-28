package com.store.pos.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@Table(name = "ARTICULOS")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Articulo {
    @Id
    @Column (name="id_articulo")
    private Long idArticulo;

    @Column (name="cod_articulo")
    private String CodArticulo;

    @Column (name = "nombre_articulo")
    private String nombreArticulo;

    @Column (name = "presentacion")
    private String presentacion;

    @Column (name = "costo_articulo")
    private Integer costo;

    @Column (name = "iva")
    private Integer iva;

    @Column (name = "codigo_externo")
    private String CodExterno;

    @Column (name = "grupo")
    private String grupo;

    @Column(name = "cantidad_articulos")
    private Long cantidadArticulo;

    @Column (name = "ipc")
    private Integer ipc;
}
