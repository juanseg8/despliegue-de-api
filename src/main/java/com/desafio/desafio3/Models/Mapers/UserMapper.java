package com.desafio.desafio3.Models.Mapers;

import com.desafio.desafio3.Models.DTOs.UserAddDTO;
import com.desafio.desafio3.Models.DTOs.UserReadDTO;
import com.desafio.desafio3.Models.Entities.AdressEntity;
import com.desafio.desafio3.Models.Entities.UserEntity;
import com.desafio.desafio3.Models.Repositories.AdressRepository;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    private final AdressRepository adressRepository;
    private final AdressMapper adressMapper;

    public UserMapper(AdressRepository adressRepository, AdressMapper adressMapper) {
        this.adressRepository = adressRepository;
        this.adressMapper = adressMapper;
    }

    public UserReadDTO userEntityToUserReadDTO(UserEntity userEntity) {
        UserReadDTO userReadDTO = new UserReadDTO();
        userReadDTO.setId(userEntity.getId());
        userReadDTO.setNombre(userEntity.getNombre());
        userReadDTO.setCelular(userEntity.getCelular());
        userReadDTO.setAdressId(adressMapper.adressEntityToAdressReadDTO(adressRepository.findById(userEntity.getAdressId()).orElse(null)));
        return userReadDTO;
    }

    public UserEntity userAddDTOToUserEntity(UserAddDTO userAddDTO, AdressEntity adress) {
        UserEntity userEntity = new UserEntity();
        userEntity.setNombre(userAddDTO.getNombre());
        userEntity.setCelular(userAddDTO.getCelular());
        userEntity.setAdressId(adress.getId());
        return userEntity;
    }
}
