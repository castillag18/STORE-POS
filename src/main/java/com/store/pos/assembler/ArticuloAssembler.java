package com.store.pos.assembler;

import com.store.pos.model.Articulo;
import com.store.pos.model.dto.ArticuloDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ArticuloAssembler {

    Articulo convertDtoToModel(ArticuloDTO articuloDTO);

    ArticuloDTO convertModelToDto(Articulo articulo);

}
