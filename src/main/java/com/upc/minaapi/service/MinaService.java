package com.upc.minaapi.service;

import com.upc.minaapi.dto.MinaDTO;
import com.upc.minaapi.model.Mina;
import com.upc.minaapi.repository.MinaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MinaService {
    final MinaRepository MinaRepository;
    final ModelMapper modelMapper = new ModelMapper();

    public MinaService(com.upc.minaapi.repository.MinaRepository minaRepository) {
        MinaRepository = minaRepository;
    }
    public List<MinaDTO> listar() {
        List<Mina> minas = MinaRepository.findAll();
        List<MinaDTO> minasDTO = new ArrayList<>();
        for (Mina mina : minas) {
            minasDTO.add(modelMapper.map(mina, MinaDTO.class));
        }
        return minasDTO;
    }
    public MinaDTO agregar(MinaDTO minaDTO) {
        Mina mina = modelMapper.map(minaDTO, Mina.class);
        mina = MinaRepository.save(mina);
        return modelMapper.map(mina, MinaDTO.class);
    }

}
