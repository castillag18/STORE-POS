package com.store.pos.controller;

import com.store.pos.model.dto.ArticuloDTO;
import com.store.pos.services.ArticuloServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class ArticuloController {

    @Autowired
    ArticuloServices articuloservices;

    @PostMapping("/creararticulo")
    public ResponseEntity <String> crear (@RequestBody ArticuloDTO articuloDTO){
        articuloservices.crearArticulo(articuloDTO);
        return new ResponseEntity<>("Articulo Creado", HttpStatus.OK);

    }



}
