package org.example;

import lombok.extern.java.Log;

@Log
public class SimpleTroll implements Troll {

    @Override
    public void attack() {
        log.info("The troll tries to grab you!");
    }

    @Override
    public int getAttackPower() {
        return 10;
    }

    @Override
    public void fleeBattle() {
        log.info("The troll shrieks in horror and runs away!");
    }
}
