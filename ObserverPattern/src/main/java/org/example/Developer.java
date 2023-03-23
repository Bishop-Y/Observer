package org.example;

public class Developer implements Observer {
    @Override
    public void update(Game game) {
        System.out.println("\nРазработчик получил технические требования:\n" + game.getTechSpecs());
    }
}
