package org.example2.square;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * КвадратныеКолышки несовместимы с КруглымиОтверстиями (они остались в проекте
 * после бывших разработчиков). Но мы должны как-то интегрировать их в нашу
 * систему.
 */
@AllArgsConstructor
@Getter
public class SquarePeg {
    private double width;

    public double getSquare() {
        return Math.pow(width, 2);
    }
}
