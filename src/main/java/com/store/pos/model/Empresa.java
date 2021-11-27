package com.store.pos.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Builder
//@Entity
//@Table(name = "EMPRESAS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Empresa {
    //@Id
    //@Column(name = "id_empresa")
    private Long idEmpresa;

   // @Column(name = "nombre_empresa")
	private String nombreEmpresa;

    //@Column(name = "ciudad_empresa")
	private String ciudadEmpresa;

   // @Column(name = "email_empresa")
	private String emailEmpresa;

   // @Column(name = "zip_code")
	private String zipCode;
}
