package com.store.pos.model;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Venta {
    private Long idArticulo;
    private Long idCliente;
    private Long cantidades;
    private Long idListaPrecio;
    private Long valorUnitario;
}
