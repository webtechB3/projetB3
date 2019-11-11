package com.projetb3.api.entities;

import org.hibernate.type.descriptor.sql.NVarcharTypeDescriptor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String Firstname;

    private String Lastname;

    private String Address;

    private String City;

    private String Country;

    private String Phone;

    private NVarcharTypeDescriptor Email;

    private NVarcharTypeDescriptor Password;

    private String Picture;

    private String Account_type;

    private NVarcharTypeDescriptor Account_token;

    public Users() {};

    public Users(String Firstname, String Lastname, String Address, String City, String Country, String Phone, NVarcharTypeDescriptor Email, NVarcharTypeDescriptor Password, String Picture, String Account_type, NVarcharTypeDescriptor Account_token){
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.Address = Address;
        this.City = City;
        this.Country = Country;
        this.Phone = Phone;
        this.Email = Email;
        this.Password = Password;
        this.Picture = Picture;
        this.Account_type = Account_type;
        this.Account_token = Account_token;
    }

    public Integer getId() {
        return Id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public String getLastname() {
        return Lastname;
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

    public String getPhone() {
        return Phone;
    }

    public NVarcharTypeDescriptor getEmail() {
        return Email;
    }

    public NVarcharTypeDescriptor getPassword() {
        return Password;
    }

    public String getPicture() {
        return Picture;
    }

    public String getAccount_type() {
        return Account_type;
    }

    public NVarcharTypeDescriptor getAccount_token() {
        return Account_token;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
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

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setEmail(NVarcharTypeDescriptor email) {
        Email = email;
    }

    public void setPassword(NVarcharTypeDescriptor password) {
        Password = password;
    }

    public void setPicture(String picture) {
        Picture = picture;
    }

    public void setAccount_type(String account_type) {
        Account_type = account_type;
    }

    public void setAccount_token(NVarcharTypeDescriptor account_token) {
        Account_token = account_token;
    }
}
