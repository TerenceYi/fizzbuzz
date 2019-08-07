package com.game.math.fizzbuzz;

public class Pupil {
    private DigitGame<String> game;

    public Pupil(DigitGame<String> game) {
        this.game = game;
    }

    public String shout(int number){
        return game.play(number);
    }
}
