package org.example;

import java.util.ArrayList;
import java.util.List;

public class GameDataBase {
    private final List<Observer> observers = new ArrayList<>();
    private final List<Game> games = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Game game) {
        for (Observer observer : observers) {
            observer.update(game);
        }
    }

    public void addGame(Game game) {
        games.add(game);
    }

    private void releaseGame(Game game) {
        System.out.println("Вышла новая игра: " + game.getName());
        notifyObservers(game);
    }

    public void releaseGames() {
        for (Game game : games) {
            releaseGame(game);
            System.out.println("\n\n\n");
        }
    }
}
