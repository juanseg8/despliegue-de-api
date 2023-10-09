package com.desafio.desafio3.Models.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String calle;
    private String numero;

}
