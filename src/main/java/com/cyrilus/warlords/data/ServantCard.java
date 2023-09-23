package com.cyrilus.warlords.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ServantCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String skills;
    private Integer atk;
    private Integer pv;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSkills() {
        return skills;
    }
    public void setSkills(String skills) {
        this.skills = skills;
    }
    public Integer getAtk() {
        return atk;
    }
    public void setAtk(Integer atk) {
        this.atk = atk;
    }
    public Integer getPv() {
        return pv;
    }
    public void setPv(Integer pv) {
        this.pv = pv;
    }

    
    
}
