package org.example;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

@RequiredArgsConstructor
@Log
public class ClubbedTroll implements Troll {

    private final Troll decorated;

    @Override
    public void attack() {
        decorated.attack();
        log.info("The troll swings at you with a club!");
    }

    @Override
    public int getAttackPower() {
        return decorated.getAttackPower() + 10;
    }

    @Override
    public void fleeBattle() {
        decorated.fleeBattle();
    }
}
