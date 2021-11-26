package com.store.pos.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArticuloDTO {

    private Long id;
    private String CodArticulo;
    private String nombre;
    private String presentacion;
    private Integer costo;
    private Integer iva;
    private String CodExterno;
    private String grupo;
    private Integer ipc;

}
