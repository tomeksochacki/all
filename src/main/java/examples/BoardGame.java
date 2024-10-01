package examples;

import java.math.BigDecimal;

public class BoardGame {
    public final String name;
    public final double rating;
    public final BigDecimal price;
    public final int minPlayers;
    public final int maxPlayers;

    public BoardGame(String name, double rating, BigDecimal price, int minPlayers, int maxPlayers) {
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }
}
