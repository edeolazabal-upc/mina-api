package com.upc.minaapi.controller;

import com.upc.minaapi.dto.MinaDTO;
import com.upc.minaapi.service.MinaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/mina")
public class MinaController {
    final MinaService minaService;

    public MinaController(MinaService minaService) {
        this.minaService = minaService;
    }
    @GetMapping
    public ResponseEntity<List<MinaDTO>> listar() {
        return ResponseEntity.ok(minaService.listar());
    }
    @PostMapping("/nuevo")
    public ResponseEntity<MinaDTO> nuevo(@RequestBody MinaDTO minaDTO) {
        return new ResponseEntity<>(this.minaService.agregar(minaDTO), HttpStatus.CREATED);
    }

}
