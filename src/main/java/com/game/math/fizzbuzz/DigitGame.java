package com.game.math.fizzbuzz;

public interface DigitGame<T> {
    String FIZZ = "Fizz";
    String BUZZ = "Buzz";
    String FIZZ_BUZZ = FIZZ + BUZZ;
    T play(int number);
}
