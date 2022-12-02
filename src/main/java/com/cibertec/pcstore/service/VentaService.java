package com.cibertec.pcstore.service;

import com.cibertec.pcstore.dto.VentaDTO;

import java.util.List;

public interface VentaService {
    List<VentaDTO> listarVentas();
    VentaDTO obtenerVentaPorID(Long id);
    VentaDTO registrarVenta(VentaDTO ventaDTO);
}
