package com.cibertec.pcstore.mappers;

import com.cibertec.pcstore.dto.*;
import com.cibertec.pcstore.model.Cliente;
import com.cibertec.pcstore.model.Producto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ClienteMapper {

    ClienteMapper instancia = Mappers.getMapper(ClienteMapper.class);

    ClienteDTO clienteAClienteDTO(Cliente cliente);

    Cliente clienteDTOACliente(ClienteDTO clienteDTO);

    Cliente clienteCreateDTOACliente(ClienteCreateDTO clienteCreateDTO);

    Cliente clienteUpdateDTOACliente(ClienteUpdateDTO clienteUpdateDTO);

    List<ClienteDTO> listaClienteAListaClienteDTO(List<Cliente> listaCliente);


}
