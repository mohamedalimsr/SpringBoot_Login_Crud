package com.example.dali.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="anime")
public class Crud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String last;
    private String user_email;

    public Crud(){

    }
    public Crud(int id, String name, String last, String user_email) {
        this.id = id;
        this.name = name;
        this.last = last;
        this.user_email = user_email;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLast() {
        return last;
    }
    public void setLast(String last) {
        this.last = last;
    }
    public String getUser_email(){ return user_email;}
  public void setUser_email(){ this.user_email = user_email;}



}
