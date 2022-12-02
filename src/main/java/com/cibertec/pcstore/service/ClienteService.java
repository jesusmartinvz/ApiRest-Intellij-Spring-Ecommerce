package com.cibertec.pcstore.service;

import com.cibertec.pcstore.dto.*;
import com.cibertec.pcstore.model.Cliente;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface ClienteService {

    List<ClienteDTO> listarClientes();

    ClienteDTO obtenerClientePorID(long id);

    ClienteDTO registrarCliente(ClienteCreateDTO clienteCreateDTO);

    ClienteDTO actualizarCliente(ClienteUpdateDTO clienteUpdateDTO);

    ClienteDTO eliminarCliente(long id);

    //AUTENTICACIÓN
    ClienteDTO authenticateClient(ClienteDTO clienteDTO);

}










