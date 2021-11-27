package com.store.pos.services.internal;

import com.store.pos.infrastructure.ArticuloRepository;
import com.store.pos.model.Articulo;
import com.store.pos.model.dto.ArticuloDTO;
import com.store.pos.services.ArticuloServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DefaultArticuloService implements ArticuloServices {

    @Autowired
    ArticuloRepository articuloRepository;

    @Override
    public void crearArticulo(ArticuloDTO articuloDTO) {
        Articulo articulo = Articulo.builder()
                .idArticulo(articuloDTO.getId())
                .CodArticulo(articuloDTO.getCodArticulo())
                .nombreArticulo(articuloDTO.getNombre())
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
    public void editarArticulo(ArticuloDTO articuloDTO) {
        Articulo articulo = Articulo.builder()
                .idArticulo(articuloDTO.getId())
                .CodArticulo(articuloDTO.getCodArticulo())
                .nombreArticulo(articuloDTO.getNombre())
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
    public void eliminarArticulo(Long id) {
        articuloRepository.deleteById(id);
    }

    @Override
    public List <ArticuloDTO> buscarart (){
      List <Articulo> articulo = articuloRepository.findAll();
      List <ArticuloDTO> articuloDTO = new ArrayList<>();
      articulo.forEach(articulo1 -> {
          ArticuloDTO articuloDTO1 = ArticuloDTO.builder()
                     .id(articulo1.getIdArticulo())
                     .nombre(articulo1.getNombreArticulo())
                     .codArticulo(articulo1.getCodArticulo())
                     .costo(articulo1.getCosto())
                     .iva(articulo1.getIva())
                     .codExterno(articulo1.getCodExterno())
                     .presentacion(articulo1.getPresentacion())
                     .grupo(articulo1.getGrupo())
                     .ipc(articulo1.getIpc())
                     .build();
          articuloDTO.add(articuloDTO1);
      });
      return articuloDTO;
    }


}
