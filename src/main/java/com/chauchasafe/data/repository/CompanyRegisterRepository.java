package com.chauchasafe.data.repository;

import com.chauchasafe.data.model.CompanyModel;
import com.chauchasafe.domain.entities.CompanyEntity;

public interface CompanyRegisterRepository {

    int saveCompany(CompanyModel companyModel);
}
