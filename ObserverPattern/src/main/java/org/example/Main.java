package org.example;

public class Main {
    public static void main(String[] args) {
        GameDataBase gameDataBase = new GameDataBase();
        gameDataBase.addGame(new Game("Uncharted 4: A Thief's End", "Четвёртая и завершающая игра серии Uncharted. " +
                "\nГлавный герой, Натан Дрейк, пытается раскрыть древний заговор, который развернулся вокруг легендарных пиратских сокровищ.",
                "Игра былы полностью переделана с нуля под виденье Нила Дракманна.", "PS4/PS5; PC: GTX 1060, 16ГБ ОЗУ, 80ГБ на жёстком диске."));

        gameDataBase.addGame(new Game("Prey", "Уникальный в своём роде симулятор выживания на космической станции. " +
                "\nГлавный герой, Морган Ю, — маленький человек, попавший во враждебный мир, где единственным преимуществом становится смекалка.",
                "Последняя игра Рафаэля Колантонио в качестве геймдиреткора и основателя Arkane Studios",
                "PS4/PS5; Xbox Series X/S; PC: GTX 660, 8 ГБ ОЗУ, 55 ГБ на жёстком диске."));

        gameDataBase.addGame(new Game("Murdered: Soul Suspect", "Детективу Ронану О'Коннору предстоит довести до конца свое последнее дело. " +
                "\nДело это весьма непростое - Ронан мертв, а расследует он собственное убийство.",
                "Последняя игра студии Airtight Games. К сожалению, она не окупилась и студию закрылии из-за убытков.",
                "PS 4; Xbox One; PC: GeForce 8800 GT, 2 ГБ ОЗУ, 12ГБ на жёстком диске."));

        gameDataBase.addObserver(new Player());
        gameDataBase.addObserver(new Journalist());
        gameDataBase.addObserver(new Developer());
        gameDataBase.releaseGames();
    }
}