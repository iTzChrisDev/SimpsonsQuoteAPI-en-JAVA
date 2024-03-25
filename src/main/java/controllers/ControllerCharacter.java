package controllers;

import java.awt.GridLayout;

import models.SimpsonCharacter;
import views.components.CharacterCard;
import views.customComponents.PanelRound;

public class ControllerCharacter {

    private ControllerAPI api;

    public ControllerCharacter() {
        api = new ControllerAPI();
        api.consumeAPI();
    }

    public void createCards(PanelRound pnl) {
        pnl.setLayout(new GridLayout(api.getCharacters().size() / 5, 5, 10, 10));
        for (SimpsonCharacter simpsonCharacter : api.getCharacters()) {
            CharacterCard card = new CharacterCard();
            card.setInfoCharacter(simpsonCharacter.getQuote(),
                    simpsonCharacter.getCharacter(),
                    simpsonCharacter.getImgPath());
            pnl.add(card);
        }
    }
}
