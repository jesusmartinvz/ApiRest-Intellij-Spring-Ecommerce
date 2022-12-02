package com.cibertec.pcstore.service;

import com.cibertec.pcstore.dto.CategoriaCreateDTO;
import com.cibertec.pcstore.dto.CategoriaDTO;
import com.cibertec.pcstore.dto.CategoriaUpdateDTO;

import java.util.List;

public interface CategoriaService {

    List<CategoriaDTO>  listarCategorias();
    CategoriaDTO obtenerCategoriaPorID(long id);
    CategoriaDTO registrarCategoria(CategoriaCreateDTO categoriaCreateDTO);
    CategoriaDTO actualizarCategoria(CategoriaUpdateDTO categoriaUpdateDTO);
    CategoriaDTO eliminarCategoria(long id);

}
