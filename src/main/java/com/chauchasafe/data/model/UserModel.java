package com.chauchasafe.data.model;

import com.chauchasafe.domain.entities.UserEntity;
import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name= "user")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger idUser;

    @Column(name = "dniUser")
    private Integer dniUser;
    @Column(name = "dvUser")
    private String dvUser;
    @Column(name = "passUser")
    private String passUser;
    @Column(name= "nameUser")
    private String nameUser;
    @Column(name= "lastNameUser")
    private String lastNameUser;
    @Column(name = "lastName2User")
    private String lastName2User;
    @Column(name = "mailUser")
    private String mailUser;
    @Column(name = "dateBirthUser")
    private Date dateBirthUser;
    @Column(name = "profileImgUser")
    private String profileImgUser;
    @Column(name = "creationDate")
    private Date creationDate;
    // revisar
    @OneToMany
    @Column(name = "idCompany")
    private CompanyModel idCompany;

    @Column(name = "region")
    private int region;
    @Column(name = "province")
    private  int province;
    @Column(name = "commune")
    private int commune;

    public BigInteger getIdUser() {
        return idUser;
    }

    public void setIdUser(BigInteger idUser) {
        this.idUser = idUser;
    }

    public Integer getDniUser() {
        return dniUser;
    }

    public void setDniUser(Integer dniUser) {
        this.dniUser = dniUser;
    }

    public String getPassUser() {
        return passUser;
    }

    public void setPassUser(String passUser) {
        this.passUser = passUser;
    }

    public String getDvUser() {
        return dvUser;
    }

    public void setDvUser(String dvUser) {
        this.dvUser = dvUser;
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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setProfileImgUser(String profileImgUser) {
        this.profileImgUser = profileImgUser;
    }

    public CompanyModel getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(CompanyModel idCompany) {
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

    public UserModel() {
        //empty for logic
    }

    public UserModel(Builder builder) {
        this.dniUser = builder.dniUser;
        this.dvUser = builder.dvUser;
        this.passUser = builder.passUser;
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
    public static class Builder {
        private Integer dniUser;
        private String dvUser;
        private String passUser;
        private String nameUser;
        private String lastNameUser;
        private String lastName2User;
        private String mailUser;
        private Date dateBirthUser;
        private String profileImgUser;
        private Date creationDate;
        private CompanyModel idCompany;
        private int region;
        private  int province;
        private int commune;

        public Builder dniUser(Integer dniUser){
            this.dniUser = dniUser;
            return this;
        }
        public Builder dvUser(String dvUser){
            this.dvUser = dvUser;
            return this;
        }
        public Builder passUser(String passUser){
            this.passUser = passUser;
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
        public Builder idCompany(CompanyModel idCompany){
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
        public UserModel build() { return new UserModel(this);}
    }
    public static Builder builder() { return new Builder(); }
}
