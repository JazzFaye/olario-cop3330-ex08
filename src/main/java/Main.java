/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

import java.util.Scanner; //Using class scanner

public class Main {

    public static void main(String[] args) {
        Scanner Pizza = new Scanner(System.in); //Scanner to obtain input from the command line

        System.out.println("How many people? ");    //prompt
        int people = Pizza.nextInt();   //Reads the number of people

        System.out.println("How many pizzas do you have? "); //prompt
        int pizza = Pizza.nextInt(); //Reads the number of pizza

        System.out.println("How many slices per pizza? ");  //prompt
        int slices = Pizza.nextInt();   //Reads the number of slices

        int totalslices = pizza * slices;   //Formula to get the total slices
        int perperson = totalslices / people;   //Formula to get how many slices can each person get
        int remainder = totalslices % people;   //Formula to get how many leftover pizzas.

        System.out.printf("%d people with %d pizza slices" + " (%d slices)", people, pizza, totalslices);
        System.out.printf("\nEach person gets %d pieces of pizza.", perperson);
        System.out.printf("\nThere are %d leftover pieces.", remainder);

    }   //End method main
}   //End Class