package com.game.math.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyInt;

@RunWith(MockitoJUnitRunner.class)
public class PupilTest {

    @Mock
    private DigitGame<String> mockGame;

    @Test
    public void shout() {
        String number = "1";
        Mockito.when(mockGame.play(anyInt())).thenReturn(number);
        Pupil pupil = new Pupil(mockGame);

        Assert.assertEquals(number, pupil.shout(1));
        Mockito.verify(mockGame,Mockito.only()).play(anyInt());

    }
}