package com.upc.minaapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mina {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String nombre;
    @Column(nullable = false)
    LocalDate fechaInicio;
    @Column(nullable = false)
    String tipo;
    Double tonsProducidas = 0.0;

}
