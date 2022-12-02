package com.cibertec.pcstore.service;

import com.cibertec.pcstore.dto.VentaDTO;
import com.cibertec.pcstore.dto.VentaDetalleDTO;
import com.cibertec.pcstore.mappers.VentaDetalleMapper;
import com.cibertec.pcstore.mappers.VentaMapper;
import com.cibertec.pcstore.model.Venta;
import com.cibertec.pcstore.model.VentaDetalle;
import com.cibertec.pcstore.repository.VentaDetalleRepository;
import com.cibertec.pcstore.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class VentaServiceImpl implements VentaService{

    @Autowired
    private VentaRepository ventaRepository;

    @Autowired
    private VentaDetalleRepository ventaDetalleRepository;

    @Override
    public List<VentaDTO> listarVentas() {
        List<VentaDTO> lista= VentaMapper.instancia.listaVentaAListaVentaDTO( ventaRepository.findAll());
        for(int x=0; x<lista.size();x++){
            lista.get(x).setVentaDetalleDTOS(
                    VentaDetalleMapper.instancia.listaVentaDetalleAListaVentaDetalleDTO(ventaDetalleRepository.getVentaDetalleByVentaId(lista.get(x).getId() ))
            );
        }
        return lista;
    }

    @Override
    public VentaDTO obtenerVentaPorID(Long id) {
        Optional<Venta> venta= ventaRepository.findById(id);
        VentaDTO ventaDTO ;
        if(venta.isPresent()){
            ventaDTO = VentaMapper.instancia.VentaAVentaDTO(venta.get());
            ventaDTO.setVentaDetalleDTOS(
                    VentaDetalleMapper.instancia.listaVentaDetalleAListaVentaDetalleDTO(ventaDetalleRepository.getVentaDetalleByVentaId(venta.get().getId()))
            );
        }else {
            ventaDTO=null;
        }
        return  ventaDTO;
    }

    @Override
    @Transactional
    public VentaDTO registrarVenta(VentaDTO ventaDTO) {
        Venta venta=VentaMapper.instancia.ventaDTOAVenta(ventaDTO);
        Venta respuestaEntity=ventaRepository.save(venta);

        for (VentaDetalleDTO venDetalleDTO :   ventaDTO.getVentaDetalleDTOS()  ) {
            VentaDetalle pd=VentaDetalleMapper.instancia.ventaDetalleDTOAVentaDetalle(venDetalleDTO);
            pd.setVenta(respuestaEntity);
            ventaDetalleRepository.save(pd);
        }

        VentaDTO respuestaDTO= VentaMapper.instancia.VentaAVentaDTO(ventaRepository.getById(respuestaEntity.getId()));
        respuestaDTO.setVentaDetalleDTOS(
                VentaDetalleMapper.instancia.listaVentaDetalleAListaVentaDetalleDTO(ventaDetalleRepository.getVentaDetalleByVentaId(respuestaEntity.getId()))
        );
        return respuestaDTO;
    }
}
