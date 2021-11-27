package com.store.pos.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@Table(name = "PERMISOS")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Permiso {

    @Id
    @Column(name = "id_permiso")
    private Long idPermiso;

    @Column(name = "nombre_permiso")
	private String nombrePermiso;
}
