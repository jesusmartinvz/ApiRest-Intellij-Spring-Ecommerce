package com.cibertec.pcstore.dto;

import com.cibertec.pcstore.model.Categoria;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public class ClienteUpdateDTO {
    private Long id;
    private String dni;
    private String nombres;
    private String apePaterno;
    private String apeMaterno;
    private String email;
    private String password;
    private String telefono;
    private String direccion;
    private Date fechaRegistro;

}
