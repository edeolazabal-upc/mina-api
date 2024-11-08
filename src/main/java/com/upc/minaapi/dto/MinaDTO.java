package com.upc.minaapi.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MinaDTO {
    Long id;
    String nombre;
    LocalDate fechaInicio;
    String tipo;
    Double tonsProducidas;
}
