package org.example1;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Captain {

    private final RowingBoat rowingBoat;

    public void row() {
        rowingBoat.row();
    }
}
