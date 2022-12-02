package com.cibertec.pcstore.mappers;

import com.cibertec.pcstore.dto.CategoriaCreateDTO;
import com.cibertec.pcstore.dto.CategoriaDTO;
import com.cibertec.pcstore.dto.CategoriaUpdateDTO;
import com.cibertec.pcstore.model.Categoria;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CategoriaMapper {

    CategoriaMapper instancia= Mappers.getMapper(CategoriaMapper.class);

    CategoriaDTO categoriaACategoriaDTO(Categoria categoria);
    Categoria categoriaDTOACategoria(CategoriaDTO categoriaDTO);
    Categoria  categoriaCreateDTOACategoria(CategoriaCreateDTO categoriaCreateDTO);
    Categoria categoriaUpdateDTOACategoria(CategoriaUpdateDTO categoriaUpdateDTO);
    List<CategoriaDTO> listaCategoriaAListaCategoriaDTO (List<Categoria> listaCategoria);


}
