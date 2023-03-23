package org.example;

public class Player implements Observer {
    @Override
    public void update(Game game) {
        System.out.println("\nИгрок получил название игры: " + game.getName() + ". И описание:\n" + game.getInfo());
    }
}
