package com.cibertec.pcstore.dto;

import com.cibertec.pcstore.model.Categoria;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.math.BigDecimal;
import java.util.Date;


@Getter
@Setter
public class ClienteDTO {

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
