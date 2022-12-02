package com.cibertec.pcstore.service;

import com.cibertec.pcstore.dto.CategoriaCreateDTO;
import com.cibertec.pcstore.dto.CategoriaDTO;
import com.cibertec.pcstore.dto.CategoriaUpdateDTO;
import com.cibertec.pcstore.mappers.CategoriaMapper;
import com.cibertec.pcstore.model.Categoria;
import com.cibertec.pcstore.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<CategoriaDTO> listarCategorias() {
 

        return CategoriaMapper.instancia.listaCategoriaAListaCategoriaDTO( categoriaRepository.findAll());
    }

    @Override
    public CategoriaDTO obtenerCategoriaPorID(long id) {
        Optional<Categoria> producto= categoriaRepository.findById(id);
        CategoriaDTO categoriaDTO ;
        if(producto.isPresent()){
            categoriaDTO = CategoriaMapper.instancia.categoriaACategoriaDTO(producto.get());
        }else {
            categoriaDTO=null;
        }
        return  categoriaDTO;
    }

    @Override
    public CategoriaDTO registrarCategoria(CategoriaCreateDTO productoCreateDTO) {
        Categoria producto=CategoriaMapper.instancia.categoriaCreateDTOACategoria(productoCreateDTO);
        Categoria respuestaEntity=categoriaRepository.save(producto);
        CategoriaDTO respuestaDTO= CategoriaMapper.instancia.categoriaACategoriaDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public CategoriaDTO actualizarCategoria(CategoriaUpdateDTO categoriaUpdateDTO) {

        Categoria producto=CategoriaMapper.instancia.categoriaUpdateDTOACategoria(categoriaUpdateDTO);
        Categoria respuestaEntity=categoriaRepository.save(producto);
        CategoriaDTO respuestaDTO= CategoriaMapper.instancia.categoriaACategoriaDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public CategoriaDTO eliminarCategoria(long id) {
        Optional<Categoria> categoriaOptional= categoriaRepository.findById(id);
        CategoriaDTO categoriaDTO = new CategoriaDTO();
        String resultado ;
        if(categoriaOptional.isPresent()){
            categoriaDTO=CategoriaMapper.instancia.categoriaACategoriaDTO(categoriaOptional.get());
            categoriaRepository.delete(categoriaOptional.get());
            return categoriaDTO;
        }else {
            return categoriaDTO;
        }
    }
}
