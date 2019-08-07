package com.game.math.fizzbuzz;

public class FizzBuzz implements DigitGame<String>{
    protected int fizz=3,buzz=5;

    public FizzBuzz() {
    }

    public FizzBuzz(int fizz, int buzz) {
        if(fizz <= 0 || buzz <=0 ){
            throw new IllegalArgumentException("Must be positive number");
        }
        this.fizz = fizz;
        this.buzz = buzz;
    }


    public String play(int number) {
        boolean isFizz = isFizz(number);
        boolean isBuzz = isBuzz(number);
        if(isFizz && isBuzz){
            return FIZZ_BUZZ;
        } else if (isFizz){
            return FIZZ;
        } else if (isBuzz){
            return BUZZ;
        }
        return String.valueOf(number);
    }

    protected boolean isFizz(int number){
        return number % fizz == 0;
    }

    protected boolean isBuzz(int number){
        return number % buzz == 0;
    }
}
