package com.cibertec.pcstore.dto;

import com.cibertec.pcstore.model.Cliente;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class VentaDTO {
    private Long id;
    private BigDecimal totalFac;
    private Date fechaFac;
    private Cliente cliente;
    private List<VentaDetalleDTO> ventaDetalleDTOS;
}
