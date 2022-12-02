package com.cibertec.pcstore.service;


import com.cibertec.pcstore.dto.ProductoCreateDTO;
import com.cibertec.pcstore.dto.ProductoDTO;
import com.cibertec.pcstore.dto.ProductoUpdateDTO;
import com.cibertec.pcstore.mappers.ProductoMapper;
import com.cibertec.pcstore.model.Producto;
import com.cibertec.pcstore.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<ProductoDTO> listarProductos() {
        return ProductoMapper.instancia.listaProductoAListaProductoDTO(productoRepository.findAll());
    }

    @Override
    public ProductoDTO obtenerProductoPorID(long id) {
        Optional<Producto> producto = productoRepository.findById(id);
        ProductoDTO productoDTO;
        if (producto.isPresent()) {
            productoDTO = ProductoMapper.instancia.productoAProductoDTO(producto.get());
        } else {
            productoDTO = null;
        }
        return productoDTO;
    }

    @Override
    public ProductoDTO registrarProducto(ProductoCreateDTO productoCreateDTO) {
        Producto producto = ProductoMapper.instancia.productoCreateDTOAProducto(productoCreateDTO);
        Producto respuestaEntity = productoRepository.save(producto);
        ProductoDTO respuestaDTO = ProductoMapper.instancia.productoAProductoDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public ProductoDTO actualizarProducto(ProductoUpdateDTO productoUpdateDTO) {

        Producto producto = ProductoMapper.instancia.productoUpdateDTOAProducto(productoUpdateDTO);
        Producto respuestaEntity = productoRepository.save(producto);
        ProductoDTO respuestaDTO = ProductoMapper.instancia.productoAProductoDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public ProductoDTO eliminarProducto(long id) {
        Optional<Producto> productoOptional = productoRepository.findById(id);
        ProductoDTO productoDTO = new ProductoDTO();
        String resultado;
        if (productoOptional.isPresent()) {
            productoDTO = ProductoMapper.instancia.productoAProductoDTO(productoOptional.get());
            productoRepository.delete(productoOptional.get());
            return productoDTO;
        } else {
            resultado = "No se pudo realizar la eliminación";
        }
        return productoDTO;
    }
}
