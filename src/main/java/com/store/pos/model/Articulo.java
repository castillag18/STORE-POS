package com.store.pos.model;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

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
    private String idArticulo;

    @Column (name="cod_articulo")
    private String codArticulo;

    @Column (name = "nombre_articulo")
    private String nombreArticulo;

    @Column (name = "presentacion")
    private String presentacion;

    @Column (name = "costo_articulo")
    private Integer costo;

    @Column (name = "iva")
    private Integer iva;

    @Column (name = "codigo_externo")
    private String codExterno;

    @Column (name = "grupo")
    private String grupo;

    @Column(name = "cantidad_articulos")
    private Long cantidadArticulo;

    @Column (name = "ipc")
    private Integer ipc;

    @PrePersist
    public void onCreate (){
        this.idArticulo = UUID.randomUUID().toString();
    }
}
