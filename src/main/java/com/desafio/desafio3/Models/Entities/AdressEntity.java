package com.desafio.desafio3.Models.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="direcion")
public class AdressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "calle", columnDefinition = "VARCHAR(100)")
    private String calle;

    @Column(name = "numero", columnDefinition = "VARCHAR(100)")
    private String numero;
}
