package com.cyrilus.warlords.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyrilus.warlords.data.CardRepository;
import com.cyrilus.warlords.data.ServantCard;

@Service
public class CardService {

    @Autowired
    CardRepository repo;

    public List<ServantCard> getALlCards(){

        List<ServantCard> tabResult = new ArrayList<>();
        Iterable<ServantCard> tab = repo.findAll();
        tab.forEach(x->tabResult.add(x));
        return tabResult;
    }

    public void createCard(ServantCard card){
        repo.save(card);
    }
    
}
