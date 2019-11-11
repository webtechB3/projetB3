package com.projetb3.api.entities;

import org.hibernate.type.descriptor.sql.NVarcharTypeDescriptor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String Title;

    private String Description;

    private Number Price;

    private String Area;

    private String Pictures;

    private String Address;

    private String City;

    private String Country;

    private Boolean Is_published;

    private Boolean Is_rented;

    private NVarcharTypeDescriptor Owner_token;

    private NVarcharTypeDescriptor Tenant_token;

    public Rents() {}

    public Rents(String Title, String Description, Number Price, String Area, String Pictures, String Address, String City, String Country, Boolean Is_published, Boolean Is_rented, NVarcharTypeDescriptor Owner_token, NVarcharTypeDescriptor Tenant_token){
        this.Title = Title;
        this.Description = Description;
        this.Price = Price;
        this.Area = Area;
        this.Pictures = Pictures;
        this.Address = Address;
        this.City = City;
        this.Country = Country;
        this.Is_published = Is_published;
        this.Is_rented = Is_rented;
        this.Owner_token = Owner_token;
        this.Tenant_token = Tenant_token;
    }

    public Integer getId() {
        return Id;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public Number getPrice() {
        return Price;
    }

    public String getArea() {
        return Area;
    }

    public String getPictures() {
        return Pictures;
    }

    public String getAddress() {
        return Address;
    }

    public String getCity() {
        return City;
    }

    public String getCountry() {
        return Country;
    }

    public Boolean getIs_published() {
        return Is_published;
    }

    public Boolean getIs_rented() {
        return Is_rented;
    }

    public NVarcharTypeDescriptor getOwner_token() {
        return Owner_token;
    }

    public NVarcharTypeDescriptor getTenant_token() {
        return Tenant_token;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setPrice(Number price) {
        Price = price;
    }

    public void setArea(String area) {
        Area = area;
    }

    public void setPictures(String pictures) {
        Pictures = pictures;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public void setIs_published(Boolean is_published) {
        Is_published = is_published;
    }

    public void setIs_rented(Boolean is_rented) {
        Is_rented = is_rented;
    }

    public void setOwner_token(NVarcharTypeDescriptor owner_token) {
        Owner_token = owner_token;
    }

    public void setTenant_token(NVarcharTypeDescriptor tenant_token) {
        Tenant_token = tenant_token;
    }
}
