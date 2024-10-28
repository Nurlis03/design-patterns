package org.example2.adapter;

import org.example2.round.RoundPeg;
import org.example2.square.SquarePeg;

/**
 * Адаптер позволяет использовать КвадратныеКолышки и КруглыеОтверстия вместе.
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        super(0);
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        // Рассчитываем минимальный радиус, в который пролезет этот колышек.
        return Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2);
    }
}