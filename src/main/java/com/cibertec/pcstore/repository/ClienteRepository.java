package com.cibertec.pcstore.repository;

import com.cibertec.pcstore.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    /*
    @Query("SELECT Cliente .email, Cliente.password FROM Cliente op WHERE Cliente.email = :email")
    Cliente getClienteByEmail(@Param(value="email") String email) throws UsernameNotFoundException;

     */

    @Query("SELECT c FROM Cliente c WHERE c.email = ?1")
    Cliente findClienteByEmail(String email);

}
