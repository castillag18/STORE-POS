package com.store.pos.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Builder
//@Entity
//@Table(name = "LISTA_PRECIOS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ListaPrecio {

    //@Id
    //@Column(name = "id_lista_precio")
    private Long idListaPrecio;

    //@Column(name = "id_articulo")
    private Long idArticulo;

    //@Column(name = "id_cliente")
	private Long idCliente;

    //@Column(name = "valor_venta")
	private Long valorVenta;
}
