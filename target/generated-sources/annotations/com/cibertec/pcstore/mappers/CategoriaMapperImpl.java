package com.cibertec.pcstore.mappers;

import com.cibertec.pcstore.dto.CategoriaCreateDTO;
import com.cibertec.pcstore.dto.CategoriaDTO;
import com.cibertec.pcstore.dto.CategoriaUpdateDTO;
import com.cibertec.pcstore.model.Categoria;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-30T15:11:32-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.14 (Oracle Corporation)"
)
public class CategoriaMapperImpl implements CategoriaMapper {

    @Override
    public CategoriaDTO categoriaACategoriaDTO(Categoria categoria) {
        if ( categoria == null ) {
            return null;
        }

        CategoriaDTO categoriaDTO = new CategoriaDTO();

        categoriaDTO.setId( categoria.getId() );
        categoriaDTO.setDesCategoria( categoria.getDesCategoria() );

        return categoriaDTO;
    }

    @Override
    public Categoria categoriaDTOACategoria(CategoriaDTO categoriaDTO) {
        if ( categoriaDTO == null ) {
            return null;
        }

        Categoria categoria = new Categoria();

        categoria.setId( categoriaDTO.getId() );
        categoria.setDesCategoria( categoriaDTO.getDesCategoria() );

        return categoria;
    }

    @Override
    public Categoria categoriaCreateDTOACategoria(CategoriaCreateDTO categoriaCreateDTO) {
        if ( categoriaCreateDTO == null ) {
            return null;
        }

        Categoria categoria = new Categoria();

        categoria.setDesCategoria( categoriaCreateDTO.getDesCategoria() );

        return categoria;
    }

    @Override
    public Categoria categoriaUpdateDTOACategoria(CategoriaUpdateDTO categoriaUpdateDTO) {
        if ( categoriaUpdateDTO == null ) {
            return null;
        }

        Categoria categoria = new Categoria();

        categoria.setId( categoriaUpdateDTO.getId() );
        categoria.setDesCategoria( categoriaUpdateDTO.getDesCategoria() );

        return categoria;
    }

    @Override
    public List<CategoriaDTO> listaCategoriaAListaCategoriaDTO(List<Categoria> listaCategoria) {
        if ( listaCategoria == null ) {
            return null;
        }

        List<CategoriaDTO> list = new ArrayList<CategoriaDTO>( listaCategoria.size() );
        for ( Categoria categoria : listaCategoria ) {
            list.add( categoriaACategoriaDTO( categoria ) );
        }

        return list;
    }
}
