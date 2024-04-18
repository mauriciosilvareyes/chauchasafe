package com.chauchasafe.data.model;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name = "category")
public class CategoryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCategory")
    private BigInteger idCategory;
    @Column (name = "descripCategory")
    private String descripCategory;

    public BigInteger getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(BigInteger idCategory) {
        this.idCategory = idCategory;
    }

    public String getDescripCategory() {
        return descripCategory;
    }

    public void setDescripCategory(String descripCategory) {
        this.descripCategory = descripCategory;
    }

    public CategoryModel() {
    }
}
