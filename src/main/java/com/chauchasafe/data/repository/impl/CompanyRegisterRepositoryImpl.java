package com.chauchasafe.data.repository.impl;

import com.chauchasafe.data.model.CompanyModel;
import com.chauchasafe.data.repository.CompanyRegisterRepository;
import com.chauchasafe.domain.entities.CompanyEntity;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CompanyRegisterRepositoryImpl implements CompanyRegisterRepository {
    @Override
    public int saveCompany(CompanyModel companyModel) {
        return 0;
    }
}
