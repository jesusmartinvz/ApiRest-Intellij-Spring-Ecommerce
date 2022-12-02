package com.cibertec.pcstore.mappers;

import com.cibertec.pcstore.dto.VentaDetalleDTO;
import com.cibertec.pcstore.model.VentaDetalle;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface VentaDetalleMapper {

    VentaDetalleMapper instancia = Mappers.getMapper(VentaDetalleMapper.class);
    VentaDetalleDTO ventaDetalleAVentaDetalleDTO(VentaDetalle ventaDetalle);
    VentaDetalle ventaDetalleDTOAVentaDetalle(VentaDetalleDTO ventaDetalleDTO);
    List<VentaDetalleDTO> listaVentaDetalleAListaVentaDetalleDTO(List<VentaDetalle> listaVentaDetalle);
    List<VentaDetalle> listaVentaDetalleDTOAListaVentaDetalle(List<VentaDetalleDTO> listaVentaDetalleDTO);

}













