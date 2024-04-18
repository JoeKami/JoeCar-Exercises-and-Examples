package com.coderscampus.unit2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //The task is to write code to collect numeric input from console.
        //You need to 'parse' a String and convert it to a number.
        //Simply use Integer.parseInt(theStringInputVariableHere)
        //Remember to import java.util.Scanner when using input streams.
        //Name your variable convertedInput of type Integer.
        //Example Output#1: Type a number between 50 and 300, (25), No!
        //Example Output#2: Type a number between 50 and 300, (75), Yes!

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number between 50 and 300");
        String input = scanner.nextLine();
        Integer convertedInput = Integer.parseInt(input);

        if((convertedInput > 50) & (convertedInput < 300)) {
            System.out.println("Yes!");
        }
        else {
            System.out.println("No!");
        }


    }
}
