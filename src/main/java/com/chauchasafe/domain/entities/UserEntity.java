package com.chauchasafe.domain.entities;

import com.chauchasafe.data.model.UserModel;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigInteger;
import java.util.Date;

public class UserEntity {

    private String dniUser;
    private String dvUser;
    private String nameUser;
    private String lastNameUser;
    private String lastName2User;
    private String mailUser;
    private Date dateBirthUser;
    private String profileImgUser;
    private Date creationDate;
    private BigInteger idCompany;
    private int region;
    private  int province;
    private int commune;

    public String getDvUser() {
        return dvUser;
    }

    public void setDvUser(String dvUser) {
        this.dvUser = dvUser;
    }

    public String getDniUser() {
        return dniUser;
    }

    public void setDniUser(String dniUser) {
        this.dniUser = dniUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getLastNameUser() {
        return lastNameUser;
    }

    public void setLastNameUser(String lastNameUser) {
        this.lastNameUser = lastNameUser;
    }

    public String getLastName2User() {
        return lastName2User;
    }

    public void setLastName2User(String lastName2User) {
        this.lastName2User = lastName2User;
    }

    public String getMailUser() {
        return mailUser;
    }

    public void setMailUser(String mailUser) {
        this.mailUser = mailUser;
    }

    public Date getDateBirthUser() {
        return dateBirthUser;
    }

    public void setDateBirthUser(Date dateBirthUser) {
        this.dateBirthUser = dateBirthUser;
    }

    public String getProfileImgUser() {
        return profileImgUser;
    }

    public void setProfileImgUser(String profileImgUser) {
        this.profileImgUser = profileImgUser;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public BigInteger getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(BigInteger idCompany) {
        this.idCompany = idCompany;
    }

    public int getRegion() {
        return region;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    public int getProvince() {
        return province;
    }

    public void setProvince(int province) {
        this.province = province;
    }

    public int getCommune() {
        return commune;
    }

    public void setCommune(int commune) {
        this.commune = commune;
    }

    public UserEntity() {
        //empty for logic
    }

    public UserEntity(Builder builder) {
        this.dniUser = builder.dniUser;
        this.dvUser = builder.dvUser;
        this.nameUser = builder.nameUser;
        this.lastNameUser = builder.lastNameUser;
        this.lastName2User = builder.lastName2User;
        this.mailUser = builder.mailUser;
        this.dateBirthUser = builder.dateBirthUser;
        this.profileImgUser = builder.profileImgUser;
        this.creationDate = builder.creationDate;
        this.idCompany = builder.idCompany;
        this.region = builder.region;
        this.province = builder.province;
        this.commune = builder.commune;
    }
    public static class Builder{
        private String dniUser;
        private String dvUser;
        private String nameUser;
        private String lastNameUser;
        private String lastName2User;
        private String mailUser;
        private Date dateBirthUser;
        private String profileImgUser;
        private Date creationDate;
        private BigInteger idCompany;
        private int region;
        private  int province;
        private int commune;

        public Builder dniUser(String dniUser){
            this.dniUser = dniUser;
            return this;
        }
        public Builder dvUser(String dvUser){
            this.dvUser = dvUser;
            return this;
        }
        public Builder nameUser(String nameUser){
            this.nameUser = nameUser;
            return this;
        }
        public Builder lastNameUser(String lastNameUser){
            this.lastNameUser = lastNameUser;
            return this;
        }
        public Builder lastName2User(String lastName2User){
            this.lastName2User = lastName2User;
            return this;
        }
        public Builder mailUser(String mailUser){
            this.mailUser = mailUser;
            return this;
        }
        public Builder dateBirthUser(Date dateBirthUser){
            this.dateBirthUser = dateBirthUser;
            return this;
        }
        public Builder profileImgUser(String profileImgUser){
            this.profileImgUser = profileImgUser;
            return this;
        }
        public Builder creationDate(Date creationDate){
            this.creationDate = creationDate;
            return this;
        }
        public Builder companyId(BigInteger idCompany){
            this.idCompany = idCompany;
            return this;
        }
        public Builder region(int region){
            this.region = region;
            return this;
        }
        public Builder province(int province){
            this.province = province;
            return this;
        }
        public Builder commune(int commune){
            this.commune = commune;
            return this;
        }
        public UserEntity build() { return new UserEntity(this);}
    }
    public static Builder builder() { return new Builder(); }

}
