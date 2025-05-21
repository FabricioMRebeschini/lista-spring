package com.fabricio.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fabricio.Repository.ListaRepository;
import com.fabricio.model.Lista;

@RestController
@RequestMapping("/api/listas")

public class ListaController {


    private final ListaRepository listaRepository;
    

    public ListaController(ListaRepository listaRepository) {
        this.listaRepository = listaRepository;
    }


    @GetMapping
    public List<Lista> list(){
        return listaRepository.findAll();
    }
    @PostMapping
    @ResponseStatus(code= HttpStatus.CREATED )
    public Lista create(@RequestBody Lista record){
        // System.out.println(record.getName());
        return listaRepository.save(record);
    }
}
