package com.cibertec.pcstore.mappers;

import com.cibertec.pcstore.dto.ProductoCreateDTO;
import com.cibertec.pcstore.dto.ProductoDTO;
import com.cibertec.pcstore.dto.ProductoUpdateDTO;
import com.cibertec.pcstore.model.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-30T15:11:32-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.14 (Oracle Corporation)"
)
public class ProductoMapperImpl implements ProductoMapper {

    @Override
    public ProductoDTO productoAProductoDTO(Producto producto) {
        if ( producto == null ) {
            return null;
        }

        ProductoDTO productoDTO = new ProductoDTO();

        productoDTO.setId( producto.getId() );
        productoDTO.setCodigo( producto.getCodigo() );
        productoDTO.setDescripcion( producto.getDescripcion() );
        productoDTO.setPrecio( producto.getPrecio() );
        productoDTO.setStock( producto.getStock() );
        productoDTO.setGarantia( producto.getGarantia() );
        productoDTO.setDescuento( producto.getDescuento() );
        productoDTO.setImagen( producto.getImagen() );
        productoDTO.setCategoria( producto.getCategoria() );

        return productoDTO;
    }

    @Override
    public Producto productoDTOAProducto(ProductoDTO productoDTO) {
        if ( productoDTO == null ) {
            return null;
        }

        Producto producto = new Producto();

        producto.setId( productoDTO.getId() );
        producto.setCodigo( productoDTO.getCodigo() );
        producto.setDescripcion( productoDTO.getDescripcion() );
        producto.setPrecio( productoDTO.getPrecio() );
        producto.setStock( productoDTO.getStock() );
        producto.setGarantia( productoDTO.getGarantia() );
        producto.setImagen( productoDTO.getImagen() );
        producto.setDescuento( productoDTO.getDescuento() );
        producto.setCategoria( productoDTO.getCategoria() );

        return producto;
    }

    @Override
    public Producto productoCreateDTOAProducto(ProductoCreateDTO productoCreateDTO) {
        if ( productoCreateDTO == null ) {
            return null;
        }

        Producto producto = new Producto();

        producto.setCodigo( productoCreateDTO.getCodigo() );
        producto.setDescripcion( productoCreateDTO.getDescripcion() );
        producto.setPrecio( productoCreateDTO.getPrecio() );
        producto.setStock( productoCreateDTO.getStock() );
        producto.setGarantia( productoCreateDTO.getGarantia() );
        producto.setImagen( productoCreateDTO.getImagen() );
        producto.setDescuento( productoCreateDTO.getDescuento() );
        producto.setCategoria( productoCreateDTO.getCategoria() );

        return producto;
    }

    @Override
    public Producto productoUpdateDTOAProducto(ProductoUpdateDTO productoUpdateDTO) {
        if ( productoUpdateDTO == null ) {
            return null;
        }

        Producto producto = new Producto();

        producto.setId( productoUpdateDTO.getId() );
        producto.setCodigo( productoUpdateDTO.getCodigo() );
        producto.setDescripcion( productoUpdateDTO.getDescripcion() );
        producto.setPrecio( productoUpdateDTO.getPrecio() );
        producto.setStock( productoUpdateDTO.getStock() );
        producto.setGarantia( productoUpdateDTO.getGarantia() );
        producto.setImagen( productoUpdateDTO.getImagen() );
        producto.setDescuento( productoUpdateDTO.getDescuento() );
        producto.setCategoria( productoUpdateDTO.getCategoria() );

        return producto;
    }

    @Override
    public List<ProductoDTO> listaProductoAListaProductoDTO(List<Producto> listaProducto) {
        if ( listaProducto == null ) {
            return null;
        }

        List<ProductoDTO> list = new ArrayList<ProductoDTO>( listaProducto.size() );
        for ( Producto producto : listaProducto ) {
            list.add( productoAProductoDTO( producto ) );
        }

        return list;
    }
}
