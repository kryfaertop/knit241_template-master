package org.knit.lab3.src;
import java.util.ArrayList;
import java.util.List;

class GetPlayer {
    private final String name;
    private final List<Player> figures;

    public GetPlayer(String name) {
        this.name = name;
        figures = new ArrayList<>();
    }

    public void addFigure(Player Figure) {
        figures.add(Figure);
    }

    public List<Player> getFigures() {
        return figures;
    }

    public String getName() {
        return name;
    }
}
