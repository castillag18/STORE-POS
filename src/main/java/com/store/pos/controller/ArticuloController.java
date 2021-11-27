package com.store.pos.controller;

import com.store.pos.model.dto.ArticuloDTO;
import com.store.pos.services.ArticuloServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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

    @GetMapping("/editararticulo")
    public ResponseEntity <String> editar (@RequestBody ArticuloDTO articuloDTO){
       articuloservices.editarArticulo(articuloDTO);
       return new ResponseEntity<>("Articulo actualizado", HttpStatus.OK);
    }

    @DeleteMapping("/eliminararticulo/{id}")
    public ResponseEntity <String> eliminar (@PathVariable Long id){
        articuloservices.eliminarArticulo(id);
        return new ResponseEntity<>("Articulo eliminado", HttpStatus.OK);
    }

    @GetMapping("/buscararticulo")
    public ResponseEntity <List<ArticuloDTO>> buscar (){
        return new ResponseEntity<List<ArticuloDTO>>(articuloservices.buscarart(), HttpStatus.OK);
    }

}
