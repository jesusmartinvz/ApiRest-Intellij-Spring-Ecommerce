package com.cibertec.pcstore.service;

import com.cibertec.pcstore.dto.ProductoCreateDTO;
import com.cibertec.pcstore.dto.ProductoDTO;
import com.cibertec.pcstore.dto.ProductoUpdateDTO;

import java.util.List;

public interface ProductoService {

    List<ProductoDTO> listarProductos();

    ProductoDTO obtenerProductoPorID(long id);

    ProductoDTO registrarProducto(ProductoCreateDTO productoCreateDTO);

    ProductoDTO actualizarProducto(ProductoUpdateDTO productoUpdateDTO);

    ProductoDTO eliminarProducto(long id);

}