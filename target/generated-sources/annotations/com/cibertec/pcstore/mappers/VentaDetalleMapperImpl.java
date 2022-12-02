package com.cibertec.pcstore.mappers;

import com.cibertec.pcstore.dto.VentaDetalleDTO;
import com.cibertec.pcstore.model.VentaDetalle;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-30T15:11:31-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.14 (Oracle Corporation)"
)
public class VentaDetalleMapperImpl implements VentaDetalleMapper {

    @Override
    public VentaDetalleDTO ventaDetalleAVentaDetalleDTO(VentaDetalle ventaDetalle) {
        if ( ventaDetalle == null ) {
            return null;
        }

        VentaDetalleDTO ventaDetalleDTO = new VentaDetalleDTO();

        ventaDetalleDTO.setId( ventaDetalle.getId() );
        ventaDetalleDTO.setProducto( ventaDetalle.getProducto() );
        ventaDetalleDTO.setCantidad( ventaDetalle.getCantidad() );
        ventaDetalleDTO.setPreciovta( ventaDetalle.getPreciovta() );
        ventaDetalleDTO.setImporte( ventaDetalle.getImporte() );
        ventaDetalleDTO.setVenta( ventaDetalle.getVenta() );

        return ventaDetalleDTO;
    }

    @Override
    public VentaDetalle ventaDetalleDTOAVentaDetalle(VentaDetalleDTO ventaDetalleDTO) {
        if ( ventaDetalleDTO == null ) {
            return null;
        }

        VentaDetalle ventaDetalle = new VentaDetalle();

        ventaDetalle.setId( ventaDetalleDTO.getId() );
        ventaDetalle.setProducto( ventaDetalleDTO.getProducto() );
        ventaDetalle.setCantidad( ventaDetalleDTO.getCantidad() );
        ventaDetalle.setPreciovta( ventaDetalleDTO.getPreciovta() );
        ventaDetalle.setImporte( ventaDetalleDTO.getImporte() );
        ventaDetalle.setVenta( ventaDetalleDTO.getVenta() );

        return ventaDetalle;
    }

    @Override
    public List<VentaDetalleDTO> listaVentaDetalleAListaVentaDetalleDTO(List<VentaDetalle> listaVentaDetalle) {
        if ( listaVentaDetalle == null ) {
            return null;
        }

        List<VentaDetalleDTO> list = new ArrayList<VentaDetalleDTO>( listaVentaDetalle.size() );
        for ( VentaDetalle ventaDetalle : listaVentaDetalle ) {
            list.add( ventaDetalleAVentaDetalleDTO( ventaDetalle ) );
        }

        return list;
    }

    @Override
    public List<VentaDetalle> listaVentaDetalleDTOAListaVentaDetalle(List<VentaDetalleDTO> listaVentaDetalleDTO) {
        if ( listaVentaDetalleDTO == null ) {
            return null;
        }

        List<VentaDetalle> list = new ArrayList<VentaDetalle>( listaVentaDetalleDTO.size() );
        for ( VentaDetalleDTO ventaDetalleDTO : listaVentaDetalleDTO ) {
            list.add( ventaDetalleDTOAVentaDetalle( ventaDetalleDTO ) );
        }

        return list;
    }
}
