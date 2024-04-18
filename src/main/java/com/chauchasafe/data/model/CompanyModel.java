package com.chauchasafe.data.model;

import com.chauchasafe.domain.entities.CompanyEntity;
import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name= "company")
public class CompanyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCompany")
    private BigInteger idCompany;
    @Column(name = "dniCompany")
    private Integer dniCompany;
    @Column(name = "dvCompany")
    private String dvCompany;
    @Column(name = "nameCompany")
    private String nameCompany;

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getDvCompany() {
        return dvCompany;
    }

    public void setDvCompany(String dvCompany) {
        this.dvCompany = dvCompany;
    }

    public Integer getDniCompany() {
        return dniCompany;
    }

    public void setDniCompany(Integer dniCompany) {
        this.dniCompany = dniCompany;
    }

    public BigInteger getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(BigInteger idCompany) {
        this.idCompany = idCompany;
    }

    public CompanyModel() {
    }

    public CompanyModel(Builder builder) {
        this.dniCompany = builder.dniCompany;
        this.dvCompany = builder.dvCompany;
        this.nameCompany = builder.nameCompany;
    }

    public static class Builder{
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

            public CompanyModel build() {return new CompanyModel(this);}
        }
        public static Builder builder() { return new Builder();}

    }

