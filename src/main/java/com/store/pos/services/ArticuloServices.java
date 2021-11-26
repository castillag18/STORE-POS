package com.store.pos.services;

import com.store.pos.model.dto.ArticuloDTO;

public interface ArticuloServices {

    void crearArticulo (ArticuloDTO articuloDTO);
    void editarArticulo();

}
