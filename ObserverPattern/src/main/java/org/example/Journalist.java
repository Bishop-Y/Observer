package org.example;

public class Journalist implements Observer {
    @Override
    public void update(Game game) {
        System.out.println("\nЖурналист получил секрет:\n" + game.getSecrets());
    }
}
