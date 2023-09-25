package com.cyrilus.warlords.data;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;

@Entity
public class ServantState {

    @EmbeddedId
    ServantStatePk id;

    @Embeddable
    private class ServantStatePk implements Serializable{

        @ManyToOne(fetch=FetchType.LAZY)
        private ServantCard servant;

        @ManyToOne(fetch=FetchType.LAZY)
        private State state;

    }
    
}
