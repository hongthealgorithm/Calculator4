package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        printOptions();

        boolean quit = false;
        while (!quit) {
            int action = 1;

            try {
                System.out.println("Enter your action(No decimals or letters.):");
                action = Integer.parseInt(scanner.next());
            }catch (NumberFormatException ignore){
                System.out.println("You entered is a letter or word or decimal number. " +
                        "Please try again(All available actions are from 0 to 11(no letters.))");

            }

            Calculator calculator = new Calculator();
            if (action == 0){
                System.out.println("Exiting Calculator......");
                quit = true;

            }else if (action == 1){

            }else if (action == 2){

                calculator.add();
            }else if (action == 3){

                calculator.sub();
            }else if (action == 4){

                calculator.mul();
            }else if (action == 5){

                calculator.div();
            }else if (action == 6){

                calculator.square();
            }else if (action == 7){

                calculator.cube();
            }else if (action == 8){

                calculator.powerOf();
            }else if (action == 9){

                calculator.sqr();
            }else if (action == 10){

                calculator.cubeRoot();
            }else if (action == 11){
                printOptions();
            }else {
                System.out.println("Oops! There was no option for the number " + action +". " +
                        "Please try again(all actions are from 0 to 10).");

            }



        }






    }

    public static void printOptions(){
        System.out.println("\nPress");
        System.out.println("0: To quit the application");
        System.out.println("1: To do nothing");
        System.out.println("2: To add 2 numbers");
        System.out.println("3: To subtract a number from another number");
        System.out.println("4: To multiply 2 numbers");
        System.out.println("5: To divide a number from another number");
        System.out.println("6: To square a number(multiply it by itself)");
        System.out.println("7: To cube a number(multiply it by itself 2 times)");
        System.out.println("8: To power the first number by the second(multiply itself by the other number's times)");
        System.out.println("9: To square root the number");
        System.out.println("10: To cube root the number");
        System.out.println("11: To print the list of options");




    }


}

