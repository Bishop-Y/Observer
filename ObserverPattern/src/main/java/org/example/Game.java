package org.example;

public class Game {

    private final String name;
    private final String info;
    private final String secrets;
    private final String techSpecs;
    public Game(String name, String info, String secrets, String techSpecs) {
        this.name = name;
        this.info = info;
        this.secrets = secrets;
        this.techSpecs = techSpecs;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public String getSecrets() {
        return secrets;
    }

    public String getTechSpecs() {
        return techSpecs;
    }
}
