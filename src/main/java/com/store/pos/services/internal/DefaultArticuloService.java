package com.store.pos.services.internal;

import com.store.pos.infrastructure.ArticuloRepository;
import com.store.pos.model.Articulo;
import com.store.pos.model.dto.ArticuloDTO;
import com.store.pos.services.ArticuloServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultArticuloService implements ArticuloServices {

    @Autowired
    ArticuloRepository articuloRepository;

    @Override
    public void crearArticulo(ArticuloDTO articuloDTO) {
        Articulo articulo = Articulo.builder()
                .id(articuloDTO.getId())
                .CodArticulo(articuloDTO.getCodArticulo())
                .nombre(articuloDTO.getNombre())
                .CodExterno(articuloDTO.getCodExterno())
                .costo(articuloDTO.getCosto())
                .grupo(articuloDTO.getGrupo())
                .ipc(articuloDTO.getIpc())
                .iva(articuloDTO.getIva())
                .presentacion(articuloDTO.getPresentacion())
                .build();
        articuloRepository.save(articulo);
    }

    @Override
    public void editarArticulo() {

    }


}
