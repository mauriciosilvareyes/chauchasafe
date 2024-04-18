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
    public int saveUser(UserModel userModel) {

        return 0;
    }
}
