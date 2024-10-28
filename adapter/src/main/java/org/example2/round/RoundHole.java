package org.example2.round;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * КруглоеОтверстие совместимо с КруглымиКолышками.
 */
@AllArgsConstructor
@Getter
public class RoundHole {
    private double radius;

    public boolean fits(RoundPeg peg) {
        return radius >= peg.getRadius();
    }
}
