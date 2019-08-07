package com.game.math.fizzbuzz;


public class FizzBuzzStage2 extends FizzBuzz {
    private String fizzString;
    private String buzzString;

    public FizzBuzzStage2() {
        init(fizz, buzz);
    }

    public FizzBuzzStage2(int fizz, int buzz) {
        super(fizz, buzz);
        init(fizz, buzz);
    }

    private void init(int fizz, int buzz) {
        fizzString = String.valueOf(fizz);
        buzzString = String.valueOf(buzz);
    }

    @Override
    public String play(int number) {
        return super.play(number);
    }

    @Override
    protected boolean isFizz(int number) {
        return super.isFizz(number) || String.valueOf(number).contains(fizzString);
    }

    @Override
    protected boolean isBuzz(int number) {
        return super.isBuzz(number) || String.valueOf(number).contains(buzzString);
    }
}
