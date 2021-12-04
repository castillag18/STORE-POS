package com.store.pos.services.internal;

import com.store.pos.assembler.ArticuloAssembler;
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

    ArticuloRepository articuloRepository;
    ArticuloAssembler articuloAssembler;

    public DefaultArticuloService(ArticuloRepository articuloRepository,
                                  ArticuloAssembler articuloAssembler) {
        this.articuloRepository = articuloRepository;
        this.articuloAssembler = articuloAssembler;
    }

    @Override
    public void crearArticulo(ArticuloDTO articuloDTO) {
        Articulo articulo = articuloAssembler.convertDtoToModel(articuloDTO);
        articuloRepository.save(articulo);
    }

    @Override
    public void editarArticulo(ArticuloDTO articuloDTO) {
        Articulo articulo = articuloAssembler.convertDtoToModel(articuloDTO);
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
          ArticuloDTO articuloDTO1 = articuloAssembler.convertModelToDto(articulo1);
          articuloDTO.add(articuloDTO1);
      });
      return articuloDTO;
    }


}
