package com.store.pos.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Builder
//@Entity
//@Table(name = "METODO_PAGO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MetodoPago {

   // @Id
    //@Column(name = "id_pago")
    private Long idPago;

    //@Column(name = "nombre_pago")
	private String nombrePago;

   // @Column(name = "fecha_vencimiento")
	private String fechaVencimiento;
}
