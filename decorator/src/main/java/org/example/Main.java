package org.example;

import lombok.extern.java.Log;

@Log
public class Main {
    public static void main(String[] args) {
        log.info("A simple looking troll approaches.");
        Troll troll = new SimpleTroll();
        troll.attack();
        troll.fleeBattle();
        log.info(String.format("Simple troll power: %s.\n", troll.getAttackPower()));

        log.info("A troll with huge club surprises you.");
        Troll clubbedTroll = new ClubbedTroll(troll);
        clubbedTroll.attack();
        clubbedTroll.fleeBattle();
        log.info(String.format("Clubbed troll power: %s.\n", clubbedTroll.getAttackPower()));
    }
}