package com.cibertec.pcstore.mappers;

import com.cibertec.pcstore.dto.ProductoCreateDTO;
import com.cibertec.pcstore.dto.ProductoDTO;
import com.cibertec.pcstore.dto.ProductoUpdateDTO;
import com.cibertec.pcstore.model.Producto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductoMapper {

    ProductoMapper instancia = Mappers.getMapper(ProductoMapper.class);

    ProductoDTO productoAProductoDTO(Producto producto);

    Producto productoDTOAProducto(ProductoDTO productoDTO);

    Producto productoCreateDTOAProducto(ProductoCreateDTO productoCreateDTO);

    Producto productoUpdateDTOAProducto(ProductoUpdateDTO productoUpdateDTO);

    List<ProductoDTO> listaProductoAListaProductoDTO(List<Producto> listaProducto);


}
