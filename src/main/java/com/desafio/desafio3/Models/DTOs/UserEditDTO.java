package com.desafio.desafio3.Models.DTOs;

import com.desafio.desafio3.Models.Entities.Direccion;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEditDTO {
    String nombre;
    Integer celular;
    Direccion direccion;
}
