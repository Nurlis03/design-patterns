package org.example;

import lombok.extern.java.Log;

@Log
public class IvoryTower implements WizardTower {

    public void enter(Wizard wizard) {
        log.info(String.format("%s enters the tower.", wizard));
    }
}