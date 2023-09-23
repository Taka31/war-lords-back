package com.cyrilus.warlords.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyrilus.warlords.data.ServantCard;
import com.cyrilus.warlords.service.CardService;

@RestController
@RequestMapping("/api/cards")
public class CardController {

    @Autowired
    private CardService service; 

    @GetMapping
    public List<ServantCard> getAllCards(){
        return this.service.getALlCards();
    }

    @PostMapping
    public void saveCard(@RequestBody ServantCard card){
        this.service.createCard(card);
    }



    
}
