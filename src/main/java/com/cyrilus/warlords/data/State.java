package com.cyrilus.warlords.data;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;

    @OneToMany(mappedBy = "id.state")
    private List<ServantState> servantStates;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ServantState> getServantStates() {
        return servantStates;
    }

    public void setServantStates(List<ServantState> servantStates) {
        this.servantStates = servantStates;
    }

    

    




    
}
