package com.cibertec.pcstore.controller;


import com.cibertec.pcstore.dto.CategoriaCreateDTO;
import com.cibertec.pcstore.dto.CategoriaDTO;
import com.cibertec.pcstore.dto.CategoriaUpdateDTO;
import com.cibertec.pcstore.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CategoriaContoller {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("categorias")
    public ResponseEntity<List<CategoriaDTO>> listarCategorias(){
        return   new ResponseEntity<>(categoriaService.listarCategorias(), HttpStatus.OK);
    }

    @GetMapping("/categorias/{categoriaId}")
    public ResponseEntity<CategoriaDTO> obtenerCategoriaPorId(@PathVariable("categoriaId") long categoriaId){
        return  new ResponseEntity<> ( categoriaService.obtenerCategoriaPorID(categoriaId),HttpStatus.OK);
    }

    @PostMapping("categorias")
    public ResponseEntity<CategoriaDTO> registrarCategoria(@RequestBody CategoriaCreateDTO categoriaCreateDTO){
        return  new ResponseEntity <>( categoriaService.registrarCategoria(categoriaCreateDTO) ,HttpStatus.OK) ;
    }

    @PutMapping("categorias")
    public ResponseEntity<CategoriaDTO> actualizarCategoria(@RequestBody CategoriaUpdateDTO categoriaUpdateDTO){
        return new ResponseEntity<>(categoriaService.actualizarCategoria(categoriaUpdateDTO),HttpStatus.OK);
    }

    @DeleteMapping("/categorias/{categoriaId}")
    public ResponseEntity<CategoriaDTO> eliminarCategoria(@PathVariable("categoriaId") long categoriaId) {
        return new ResponseEntity<>( categoriaService.eliminarCategoria(categoriaId),HttpStatus.OK);
    }
}
