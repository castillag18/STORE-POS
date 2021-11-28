package com.store.pos.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VentaDTO {

    private Long idArticulo;
    private Long cantidades;
    private Long valorUnitario;

}