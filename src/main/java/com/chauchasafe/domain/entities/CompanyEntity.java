package com.chauchasafe.domain.entities;

import jakarta.persistence.Column;
import com.chauchasafe.data.model.CompanyModel;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigInteger;

public class CompanyEntity {

    private Integer dniCompany;
    private String dvCompany;
    private String nameCompany;

    public String getDvCompany() {
        return dvCompany;
    }

    public void setDvCompany(String dvCompany) {
        this.dvCompany = dvCompany;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public Integer getDniCompany() {
        return dniCompany;
    }

    public void setDniCompany(Integer dniCompany) {
        this.dniCompany = dniCompany;
    }

    public CompanyEntity() {
    }

    public CompanyEntity(Builder builder) {
        this.dniCompany = builder.dniCompany;
        this.dvCompany = builder.dvCompany;
        this.nameCompany = builder.nameCompany;
    }

    public static class Builder {
        private Integer dniCompany;
        private String dvCompany;
        private String nameCompany;


        public Builder dniCompany(int dniCompany) {
            this.dniCompany = dniCompany;
            return this;
        }

        public Builder dvCompany(String dvCompany) {
            this.dvCompany = dvCompany;
            return this;
        }

        public Builder nameCompany(String nameCompany) {
            this.nameCompany = nameCompany;
            return this;
        }

        public CompanyEntity build() {return new CompanyEntity(this);}
    }
    public static Builder builder() { return new Builder();}

}


