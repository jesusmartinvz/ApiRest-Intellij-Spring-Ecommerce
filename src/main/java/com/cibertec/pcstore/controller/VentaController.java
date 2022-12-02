package com.cibertec.pcstore.controller;

import com.cibertec.pcstore.dto.VentaDTO;
import com.cibertec.pcstore.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @GetMapping("ventas")
    public ResponseEntity<List<VentaDTO>> listarVentas(){
        return   new ResponseEntity<>(ventaService.listarVentas(), HttpStatus.OK);
    }

    @GetMapping("/ventas/{ventaId}")
    public ResponseEntity<VentaDTO> obtenerVentaPorId(@PathVariable("ventaId") long ventaId){
        return  new ResponseEntity<> ( ventaService.obtenerVentaPorID(ventaId),HttpStatus.OK);
    }

    @PostMapping("ventas")
    public ResponseEntity<VentaDTO> registrarVenta(@RequestBody VentaDTO ventaDTO){
        return  new ResponseEntity <>( ventaService.registrarVenta(ventaDTO) ,HttpStatus.OK) ;
    }
}
