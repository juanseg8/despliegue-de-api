package com.desafio.desafio3.Models.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAddDTO {
    String nombre;
    Integer celular;
    Object direccion;
}
