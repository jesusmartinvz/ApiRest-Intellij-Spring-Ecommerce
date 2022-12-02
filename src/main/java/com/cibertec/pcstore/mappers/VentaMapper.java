package com.cibertec.pcstore.mappers;

import com.cibertec.pcstore.dto.VentaDTO;
import com.cibertec.pcstore.model.Venta;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface VentaMapper {
    VentaMapper instancia= Mappers.getMapper(VentaMapper.class);
    VentaDTO VentaAVentaDTO(Venta venta);
    Venta ventaDTOAVenta(VentaDTO ventaDTO);
    List<VentaDTO> listaVentaAListaVentaDTO(List<Venta> listaVenta);
}


















