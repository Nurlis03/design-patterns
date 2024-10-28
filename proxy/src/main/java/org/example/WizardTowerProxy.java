package org.example;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

@Log
@RequiredArgsConstructor
public class WizardTowerProxy implements WizardTower {

    private static final int NUM_WIZARDS_ALLOWED = 3;

    private int numWizards;

    private final WizardTower tower;

    @Override
    public void enter(Wizard wizard) {
        if (numWizards < NUM_WIZARDS_ALLOWED) {
            tower.enter(wizard);
            numWizards++;
        } else {
            log.info(String.format("%s is not allowed to enter!", wizard));
        }
    }
}