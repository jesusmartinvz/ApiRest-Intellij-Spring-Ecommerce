package com.cibertec.pcstore.repository;

import com.cibertec.pcstore.model.VentaDetalle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VentaDetalleRepository extends JpaRepository<VentaDetalle, Long> {
    public List<VentaDetalle> getVentaDetalleByVentaId(Long id);
}
