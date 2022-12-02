package com.cibertec.pcstore.mappers;

import com.cibertec.pcstore.dto.VentaDTO;
import com.cibertec.pcstore.model.Venta;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-30T15:11:32-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.14 (Oracle Corporation)"
)
public class VentaMapperImpl implements VentaMapper {

    @Override
    public VentaDTO VentaAVentaDTO(Venta venta) {
        if ( venta == null ) {
            return null;
        }

        VentaDTO ventaDTO = new VentaDTO();

        ventaDTO.setId( venta.getId() );
        ventaDTO.setTotalFac( venta.getTotalFac() );
        ventaDTO.setFechaFac( venta.getFechaFac() );
        ventaDTO.setCliente( venta.getCliente() );

        return ventaDTO;
    }

    @Override
    public Venta ventaDTOAVenta(VentaDTO ventaDTO) {
        if ( ventaDTO == null ) {
            return null;
        }

        Venta venta = new Venta();

        venta.setId( ventaDTO.getId() );
        venta.setTotalFac( ventaDTO.getTotalFac() );
        venta.setFechaFac( ventaDTO.getFechaFac() );
        venta.setCliente( ventaDTO.getCliente() );

        return venta;
    }

    @Override
    public List<VentaDTO> listaVentaAListaVentaDTO(List<Venta> listaVenta) {
        if ( listaVenta == null ) {
            return null;
        }

        List<VentaDTO> list = new ArrayList<VentaDTO>( listaVenta.size() );
        for ( Venta venta : listaVenta ) {
            list.add( VentaAVentaDTO( venta ) );
        }

        return list;
    }
}
