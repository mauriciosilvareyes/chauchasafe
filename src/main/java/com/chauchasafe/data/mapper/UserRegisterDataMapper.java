package com.chauchasafe.data.mapper;

import com.chauchasafe.data.model.UserModel;
import com.chauchasafe.domain.entities.UserEntity;

public class UserRegisterDataMapper {

    public UserModel mapEntityToModel(UserEntity userEntity){
        return UserModel.builder()
                .dniUser(userEntity.getDniUser())
                .dvUser(userEntity.getDvUser())
                .passUser(userEntity.getPassUser())
                .nameUser(userEntity.getNameUser())
                .lastNameUser(userEntity.getLastNameUser())
                .lastName2User(userEntity.getLastName2User())
                .mailUser(userEntity.getMailUser())
                .dateBirthUser(userEntity.getDateBirthUser())
                .profileImgUser(userEntity.getProfileImgUser())
                .creationDate(userEntity.getCreationDate())
                .idCompany(userEntity.getIdCompany())
                .region(userEntity.getRegion())
                .province(userEntity.getProvince())
                .commune(userEntity.getCommune())
                .build();
    }
}
