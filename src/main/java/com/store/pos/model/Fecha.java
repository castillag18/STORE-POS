package com.store.pos.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Builder
//@Entity
//@Table(name = "FECHAS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fecha {

    //@Column(name = "fecha_cierre")
    private String fechaCierre;

    //@Column(name = "fecha_sistema")
	private String fechaSistema;
}
