package com.store.pos.assembler;

import com.store.pos.model.Articulo;
import com.store.pos.model.dto.ArticuloDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ArticuloAssembler {

    @Mapping(source = "id", target = "idArticulo")
    @Mapping(source = "codArticulo", target = "codArticulo")
    @Mapping(source = "nombre", target = "nombreArticulo")
    @Mapping(source = "presentacion", target = "presentacion")
    @Mapping(source = "costo", target = "costo")
    @Mapping(source = "iva", target = "iva")
    @Mapping(source = "codExterno", target = "codExterno")
    @Mapping(source = "grupo", target = "grupo")
    @Mapping(source = "ipc", target = "ipc")
    Articulo convertDtoToModel(ArticuloDTO articuloDTO);

    @Mapping(source = "idArticulo", target = "id")
    @Mapping(source = "codArticulo", target = "codArticulo")
    @Mapping(source = "nombreArticulo", target = "nombre")
    @Mapping(source = "presentacion", target = "presentacion")
    @Mapping(source = "costo", target = "costo")
    @Mapping(source = "iva", target = "iva")
    @Mapping(source = "codExterno", target = "codExterno")
    @Mapping(source = "grupo", target = "grupo")
    @Mapping(source = "ipc", target = "ipc")
    ArticuloDTO convertModelToDto(Articulo articulo);

}
