package com.store.pos.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Builder
//@Table(name = "GRUPOS")
//@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Grupo {
   //@Id
   //@Column(name = "id_grupo")
   private Long idGrupo;

   //@Column(name = "cod_grupo")
   private Integer codGrupo;

   //@Column(name = "nombre_grupo")
   private  String nombreGrupo;

  // @Column(name = "descripcion")
   private String descripcion;

   //@Column(name = "grupo_articulos")
   private String grupoArticulos;
}
