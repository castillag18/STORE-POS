package com.store.pos.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Builder
//@Table(name = "CLIENTES")
//@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
	//@Id
    //@Column(name = "id_cliente")
    private Long id;

   // @Column(name = "tipo_documento")
	private String tipoDocumento;

    //@Column(name = "numero_documento")
	private String numeroDocumento;

    //@Column(name = "nombre_cliente")
	private String nombreCliente;

   // @Column(name = "apellido_cliente")
	private String apellidoCliente;

    //@Column(name = "empresa")
	private String empresa;

   // @Column(name = "email_cliente")
	private String emailCliente;

   // @Column(name = "direccion_cliente")
	private String direccionCliente;

    //@Column(name = "centro_pagos")
	private String centroPagos;

    //@Column(name = "monto_autorizado")
	private Long montoAutorizado;

}
