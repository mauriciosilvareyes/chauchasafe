package com.chauchasafe.data.repository.impl;

import com.chauchasafe.data.model.UserModel;
import com.chauchasafe.data.repository.UserRegisterRepository;
import com.chauchasafe.domain.entities.UserEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserRegisterRepositoryImpl implements UserRegisterRepository {

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public int saveUser(UserEntity userEntity) {



        entityManager.persist(UserModel.builder()
                .dniUser(userEntity.getDniUser())
                .dvUser(userEntity.getDvUser())
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
                .build());

        if (entityManager.isOpen()){
            entityManager.close();
        }
        return 0;
    }
}
