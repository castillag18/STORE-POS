package com.store.pos.model.dto;

import lombok.*;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArticuloDTO {

    private Long idArticulo;
    private String codArticulo;
    private String nombre;
    private String presentacion;
    private Integer costo;
    private Integer iva;
    private String codExterno;
    private String grupo;
    private Integer ipc;

}
