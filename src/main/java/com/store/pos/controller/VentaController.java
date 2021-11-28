package com.store.pos.controller;


import com.store.pos.model.dto.VentaDTO;
import com.store.pos.services.VentaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class VentaController {

    @Autowired
    private VentaServices ventaServices;

    @PostMapping("/venta")
    public ResponseEntity <String> venta (Long idCliente, List<VentaDTO> ventaDTO){
        ventaServices.venta(idCliente, ventaDTO);
        return new ResponseEntity<>("vendido", HttpStatus.OK);
    }
}
