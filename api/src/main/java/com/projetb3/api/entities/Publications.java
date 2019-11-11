package com.projetb3.api.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Publications {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private Integer Rent_id;

    private Date Start_at;

    private Date End_at;

    private Date Create_at;

    public Publications() {};

    public Publications(Integer Rent_id, Date Start_at, Date End_at, Date Create_at){
        this.Rent_id = Rent_id;
        this.Start_at = Start_at;
        this.End_at = End_at;
        this.Create_at = Create_at;
    }

    public Integer getId() {
        return Id;
    }

    public Integer getRent_id() {
        return Rent_id;
    }

    public Date getStart_at() {
        return Start_at;
    }

    public Date getEnd_at() {
        return End_at;
    }

    public Date getCreate_at() {
        return Create_at;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setRent_id(Integer rent_id) {
        Rent_id = rent_id;
    }

    public void setStart_at(Date start_at) {
        Start_at = start_at;
    }

    public void setEnd_at(Date end_at) {
        End_at = end_at;
    }

    public void setCreate_at(Date create_at) {
        Create_at = create_at;
    }
}
