package com.projetb3.api.entities;

import org.hibernate.type.descriptor.sql.NVarcharTypeDescriptor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reservations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private NVarcharTypeDescriptor Tenant_token;

    private Integer Publication_id;

    public Reservations() {}

    public Reservations(NVarcharTypeDescriptor Tenant_token, Integer Publication_id){
        this.Tenant_token = Tenant_token;
        this.Publication_id = Publication_id;
    }

    public Integer getId() {
        return Id;
    }

    public NVarcharTypeDescriptor getTenant_token() {
        return Tenant_token;
    }

    public Integer getPublication_id() {
        return Publication_id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setTenant_token(NVarcharTypeDescriptor tenant_token) {
        Tenant_token = tenant_token;
    }

    public void setPublication_id(Integer publication_id) {
        Publication_id = publication_id;
    }
}
