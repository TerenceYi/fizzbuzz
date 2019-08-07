package com.game.math.fizzbuzz;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzStage2Test {

    @Test
    public void play() {
        doVerify(new FizzBuzzStage2());
        doVerify(new FizzBuzzStage2(3,5));
    }

    private void doVerify(FizzBuzzStage2 stage2){
        assertEquals("1", stage2.play(1));
        assertEquals("2", stage2.play(2));
        assertEquals("Fizz", stage2.play(3));
        assertEquals("Fizz", stage2.play(6));
        assertEquals("Fizz", stage2.play(13));
        assertEquals("Buzz", stage2.play(5));
        assertEquals("Buzz", stage2.play(25));
        assertEquals("FizzBuzz", stage2.play(15));
        assertEquals("FizzBuzz", stage2.play(51));
    }
}