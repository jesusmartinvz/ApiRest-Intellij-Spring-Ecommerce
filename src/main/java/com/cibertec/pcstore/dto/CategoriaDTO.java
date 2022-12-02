package com.cibertec.pcstore.dto;

import com.cibertec.pcstore.model.Producto;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class CategoriaDTO {

    private Long id;
    private String desCategoria;
    //private Set<Producto> producto;
}
