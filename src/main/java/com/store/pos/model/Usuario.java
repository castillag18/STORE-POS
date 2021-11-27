package com.store.pos.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Builder
//@Entity
//@Table(name = "USUARIOS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    //@Id
   // @Column(name = "id_usuario")
    private Long idUsuario;

   // @Column(name = "cod_usuario")
    private Long codUsuario;

    //@Column(name = "nombre_usuario")
    private String nombreUsuario;

    //@Column(name = "tipo_documento")
    private String tipoDocumento;

   // @Column(name = "numero_documento")
    private String numeroDocumento;

    //@Column(name = "numero_telefono")
    private String numeroTelefono;

    //@Column(name = "email_usuario")
    private String emailUsuario;

    //@Column(name = "permiso")
    private String permiso;
}
