package com.cibertec.pcstore.mappers;

import com.cibertec.pcstore.dto.ClienteCreateDTO;
import com.cibertec.pcstore.dto.ClienteDTO;
import com.cibertec.pcstore.dto.ClienteUpdateDTO;
import com.cibertec.pcstore.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-30T15:11:32-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.14 (Oracle Corporation)"
)
public class ClienteMapperImpl implements ClienteMapper {

    @Override
    public ClienteDTO clienteAClienteDTO(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        ClienteDTO clienteDTO = new ClienteDTO();

        clienteDTO.setId( cliente.getId() );
        clienteDTO.setDni( cliente.getDni() );
        clienteDTO.setNombres( cliente.getNombres() );
        clienteDTO.setApePaterno( cliente.getApePaterno() );
        clienteDTO.setApeMaterno( cliente.getApeMaterno() );
        clienteDTO.setEmail( cliente.getEmail() );
        clienteDTO.setPassword( cliente.getPassword() );
        clienteDTO.setTelefono( cliente.getTelefono() );
        clienteDTO.setDireccion( cliente.getDireccion() );
        clienteDTO.setFechaRegistro( cliente.getFechaRegistro() );

        return clienteDTO;
    }

    @Override
    public Cliente clienteDTOACliente(ClienteDTO clienteDTO) {
        if ( clienteDTO == null ) {
            return null;
        }

        Cliente cliente = new Cliente();

        cliente.setId( clienteDTO.getId() );
        cliente.setDni( clienteDTO.getDni() );
        cliente.setNombres( clienteDTO.getNombres() );
        cliente.setApePaterno( clienteDTO.getApePaterno() );
        cliente.setApeMaterno( clienteDTO.getApeMaterno() );
        cliente.setEmail( clienteDTO.getEmail() );
        cliente.setPassword( clienteDTO.getPassword() );
        cliente.setTelefono( clienteDTO.getTelefono() );
        cliente.setDireccion( clienteDTO.getDireccion() );
        cliente.setFechaRegistro( clienteDTO.getFechaRegistro() );

        return cliente;
    }

    @Override
    public Cliente clienteCreateDTOACliente(ClienteCreateDTO clienteCreateDTO) {
        if ( clienteCreateDTO == null ) {
            return null;
        }

        Cliente cliente = new Cliente();

        cliente.setDni( clienteCreateDTO.getDni() );
        cliente.setNombres( clienteCreateDTO.getNombres() );
        cliente.setApePaterno( clienteCreateDTO.getApePaterno() );
        cliente.setApeMaterno( clienteCreateDTO.getApeMaterno() );
        cliente.setEmail( clienteCreateDTO.getEmail() );
        cliente.setPassword( clienteCreateDTO.getPassword() );
        cliente.setTelefono( clienteCreateDTO.getTelefono() );
        cliente.setDireccion( clienteCreateDTO.getDireccion() );
        cliente.setFechaRegistro( clienteCreateDTO.getFechaRegistro() );

        return cliente;
    }

    @Override
    public Cliente clienteUpdateDTOACliente(ClienteUpdateDTO clienteUpdateDTO) {
        if ( clienteUpdateDTO == null ) {
            return null;
        }

        Cliente cliente = new Cliente();

        cliente.setId( clienteUpdateDTO.getId() );
        cliente.setDni( clienteUpdateDTO.getDni() );
        cliente.setNombres( clienteUpdateDTO.getNombres() );
        cliente.setApePaterno( clienteUpdateDTO.getApePaterno() );
        cliente.setApeMaterno( clienteUpdateDTO.getApeMaterno() );
        cliente.setEmail( clienteUpdateDTO.getEmail() );
        cliente.setPassword( clienteUpdateDTO.getPassword() );
        cliente.setTelefono( clienteUpdateDTO.getTelefono() );
        cliente.setDireccion( clienteUpdateDTO.getDireccion() );
        cliente.setFechaRegistro( clienteUpdateDTO.getFechaRegistro() );

        return cliente;
    }

    @Override
    public List<ClienteDTO> listaClienteAListaClienteDTO(List<Cliente> listaCliente) {
        if ( listaCliente == null ) {
            return null;
        }

        List<ClienteDTO> list = new ArrayList<ClienteDTO>( listaCliente.size() );
        for ( Cliente cliente : listaCliente ) {
            list.add( clienteAClienteDTO( cliente ) );
        }

        return list;
    }
}
