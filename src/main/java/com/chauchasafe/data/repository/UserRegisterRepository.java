package com.chauchasafe.data.repository;

import com.chauchasafe.data.model.UserModel;
import com.chauchasafe.domain.entities.UserEntity;

public interface UserRegisterRepository {

    int saveUser(UserEntity userEntity);
}
