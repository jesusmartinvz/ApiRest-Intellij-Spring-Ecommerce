package com.cibertec.pcstore.dto;

import com.cibertec.pcstore.model.Producto;
import com.cibertec.pcstore.model.Venta;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Getter
@Setter
public class VentaDetalleDTO {

    private Long id;
    private Producto producto;
    private Long cantidad;
    private BigDecimal preciovta;
    private BigDecimal importe;
    private Venta venta;
}
