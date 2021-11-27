package com.store.pos.services;

import com.store.pos.model.dto.ArticuloDTO;

import java.util.List;

public interface ArticuloServices {

    void crearArticulo (ArticuloDTO articuloDTO);
    void editarArticulo(ArticuloDTO articuloDTO);
    void eliminarArticulo(Long id);
    List <ArticuloDTO> buscarart ();
}
