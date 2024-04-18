package com.chauchasafe.data.mapper;

import com.chauchasafe.data.model.CompanyModel;
import com.chauchasafe.domain.entities.CompanyEntity;

public class CompanyRegisterDataMapper {

    public CompanyModel mapEntityToModel(CompanyEntity companyEntity){

        return CompanyModel.builder()
                .dniCompany(companyEntity.getDniCompany())
                .dvCompany(companyEntity.getDvCompany())
                .nameCompany(companyEntity.getNameCompany())
                .build();
    }
}
