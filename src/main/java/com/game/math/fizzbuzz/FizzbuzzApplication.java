package com.game.math.fizzbuzz;

import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.charset.Charset;

@SpringBootApplication
public class FizzbuzzApplication {

	public static void main(String[] args) {
		DefaultApplicationArguments arguments = new DefaultApplicationArguments(args);
		if(arguments.containsOption("help") || arguments.containsOption("h")){
			System.out.println("\nNAME\n"
					+ "              BizzBuzz game  \n\n"
					+ "SYNOPSIS\n"
					+ "              java -jar bizzbuzz-2.1.7.RELEASE.jar [options...]\n\n"
					+ "DESCRIPTION\n"
					+ "              A program that print the numbers from 1 to 100 . For multiples of three"
					+ "print \"Fizz\" instead of the number and for multiples of five print \"Buzz\"."
					+ "For numbers which are multiples of both three and five print \"FizzBuzz\"\n"
					+ "\nEXAMPLE:\n"
					+ "              java -jar bizzbuzz-2.1.7.RELEASE.jar \n"
					+ "              java -jar bizzbuzz-2.1.7.RELEASE.jar --max=200 --stage2\n"
					+ "OPTIONS:\n"
					+ "              Provide options by commandline args: --key=value. Support options with default values:\n"
					+ "              --max=<number>  change the program play from 1 to <number>\n"
					+ "              --stage2        change the program to search the occurrence of three or five in string"
					);
			System.exit(0);
		}
		int max = 100;
		if(arguments.containsOption("max")){
			max = Integer.valueOf(arguments.getOptionValues("max").get(0));
		}
		DigitGame<String> game = arguments.containsOption("stage2") ? new FizzBuzzStage2() : new FizzBuzz();
		Pupil pupil = new Pupil(game);
		for(int i=1;i<=max;i++){
			System.out.println(pupil.shout(i));
		}

		SpringApplication.run(FizzbuzzApplication.class, args);

	}

}
