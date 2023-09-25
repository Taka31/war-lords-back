package com.cyrilus.warlords.data;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class ServantCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String skills;
    private Integer atk;
    private Integer pv;

    @ManyToOne
    private Type type;

    @OneToMany(mappedBy = "id.servant")
    private List<ServantState> servantStates;

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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<ServantState> getServantStates() {
        return servantStates;
    }

    public void setServantStates(List<ServantState> servantStates) {
        this.servantStates = servantStates;
    }

    

}