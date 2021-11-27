package com.store.pos.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Builder
@Table(name = "TIPO_VENTAS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TipoVenta {

    @Id
    @Column(name = "id_venta")
    private Long idVenta;

    @Column(name = "credito")
	private Long credito;

    @Column(name = "contado")
	private Long contado;

    @Column(name = "remision")
	private Long remision;

    @Column(name = "anticipado")
	private Long anticipado;
}
