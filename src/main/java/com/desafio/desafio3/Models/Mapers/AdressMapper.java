package com.desafio.desafio3.Models.Mapers;

import com.desafio.desafio3.Models.DTOs.AdressReadDTO;
import com.desafio.desafio3.Models.Entities.AdressEntity;
import org.springframework.stereotype.Component;

@Component
public class AdressMapper  {
    public AdressReadDTO adressEntityToAdressReadDTO (AdressEntity adressEntity){
        AdressReadDTO adressReadDTO = new AdressReadDTO();
        adressReadDTO.setCalle(adressEntity.getCalle());
        adressReadDTO.setNumero(adressEntity.getNumero());
        return adressReadDTO;
    }

}
