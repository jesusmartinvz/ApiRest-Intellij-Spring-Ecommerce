package com.cibertec.pcstore.service;


import com.cibertec.pcstore.dto.*;
import com.cibertec.pcstore.mappers.ClienteMapper;
import com.cibertec.pcstore.mappers.ProductoMapper;
import com.cibertec.pcstore.model.Cliente;
import com.cibertec.pcstore.model.Producto;
import com.cibertec.pcstore.repository.ClienteRepository;
import com.cibertec.pcstore.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<ClienteDTO> listarClientes() {
        return ClienteMapper.instancia.listaClienteAListaClienteDTO(clienteRepository.findAll());
    }

    @Override
    public ClienteDTO obtenerClientePorID(long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        ClienteDTO clienteDTO;
        if (cliente.isPresent()) {
            clienteDTO = ClienteMapper.instancia.clienteAClienteDTO(cliente.get());
        } else {
            clienteDTO = null;
        }
        return clienteDTO;
    }

    @Override
    public ClienteDTO registrarCliente(ClienteCreateDTO clienteCreateDTO) {
        BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();

        Cliente cliente = ClienteMapper.instancia.clienteCreateDTOACliente(clienteCreateDTO);

        String encryptedPwd = bcrypt.encode(cliente.getPassword());
        cliente.setPassword(encryptedPwd);


        Cliente respuestaEntity = clienteRepository.save(cliente);
        ClienteDTO respuestaDTO = ClienteMapper.instancia.clienteAClienteDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public ClienteDTO actualizarCliente(ClienteUpdateDTO clienteUpdateDTO) {

        Cliente cliente = ClienteMapper.instancia.clienteUpdateDTOACliente(clienteUpdateDTO);
        Cliente respuestaEntity = clienteRepository.save(cliente);
        ClienteDTO respuestaDTO = ClienteMapper.instancia.clienteAClienteDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public ClienteDTO eliminarCliente(long id) {
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);
        ClienteDTO clienteDTO = new ClienteDTO();
        String resultado;
        if (clienteOptional.isPresent()) {
            clienteDTO = ClienteMapper.instancia.clienteAClienteDTO(clienteOptional.get());
            clienteRepository.delete(clienteOptional.get());
            return clienteDTO;
        } else {
            resultado = "No se pudo realizar la eliminación";
        }
        return clienteDTO;
    }


    @Override
    public ClienteDTO authenticateClient(ClienteDTO clienteDTO){
        BCryptPasswordEncoder bcryp=new BCryptPasswordEncoder();

        Optional<Cliente> opCliente = Optional.ofNullable(clienteRepository.findClienteByEmail(clienteDTO.getEmail()));

        ClienteDTO clienteDTOResp = null;

        if(opCliente.isPresent()){
            Cliente dbCliente = opCliente.get();
            if(bcryp.matches(clienteDTO.getPassword(), dbCliente.getPassword())){
                clienteDTOResp = ClienteMapper.instancia.clienteAClienteDTO(opCliente.get());
            }else{
                clienteDTOResp = null;
            }
        }
        return clienteDTOResp;
    }


}
