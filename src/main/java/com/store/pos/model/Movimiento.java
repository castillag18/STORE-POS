package com.store.pos.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Table;

//@Builder
//@Table(name = "MOVIMIENTOS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movimiento {

    //@Column(name = "id_articulo")
    private Long idArticulo;

    //@Column(name = "id_cliente")
    private Long idCliente;

    //@Column(name = "id_empresa")
    private Long idEmpresa;

   // @Column(name = "id_lista_precio")
    private Long idListaPrecio;

    //@Column(name = "cantidades")
    private Long cantidades;

  //  @Column(name = "valor_unitario")
    private Long valorUnitario;

   // @Column(name = "valor_total")
    private Long valorTotal;

   // @Column(name = "movimientos")
    private Long movimientos;

   // @Column(name = "fecha_regristro")
    private String fechaRegristro;

    //@Column(name = "fecha_documento")
    private String fechaDocumento;
}
