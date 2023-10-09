package com.desafio.desafio3.Models.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "direccion")

public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "calle", columnDefinition = "VARCHAR(100)")
    private String calle;
    @Column(name = "numero", columnDefinition = "VARCHAR(100)")
    private String numero;

}
