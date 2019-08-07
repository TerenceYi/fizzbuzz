package com.game.math.fizzbuzz;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void play() {
        doVerify(new FizzBuzz());
        doVerify(new FizzBuzz(3,5));
    }

    private void doVerify(FizzBuzz fizzbuzz){
        assertEquals("1", fizzbuzz.play(1));
        assertEquals("2", fizzbuzz.play(2));
        assertEquals("Fizz", fizzbuzz.play(3));
        assertEquals("Fizz", fizzbuzz.play(6));
        assertEquals("13", fizzbuzz.play(13));
        assertEquals("Buzz", fizzbuzz.play(5));
        assertEquals("Buzz", fizzbuzz.play(25));
        assertEquals("FizzBuzz", fizzbuzz.play(15));
        assertEquals("52", fizzbuzz.play(52));
    }
}