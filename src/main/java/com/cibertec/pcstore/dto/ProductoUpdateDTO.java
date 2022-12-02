package com.cibertec.pcstore.dto;

import com.cibertec.pcstore.model.Categoria;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductoUpdateDTO {
    private Long id;
    private String codigo;
    private String descripcion;
    private BigDecimal precio;
    private Integer stock;
    private Integer garantia;
    private BigDecimal descuento;
    private Long idCategoria;
    private String imagen;

    private Categoria categoria;

}
