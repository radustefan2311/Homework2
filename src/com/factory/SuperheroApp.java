package com.factory;

import java.util.Scanner;

public class SuperheroApp {
    public static void main(String[] args) {
        System.out.println("""
                This is the Superhero Simulator App!
                Please select a superhero out of these 3 (Batman/Superman/Spiderman) 
                The superhero you selected can either have a short presentation or save a person (presentation/saveme).
                When you are done interacting with your chosen superhero type next.
                If you want to exit our simulation type quit.""");

        Scanner scanner = new Scanner(System.in);
        superheroFactory SuperheroFactory = new superheroFactory();
        System.out.print("Choose your superhero: ");
        String in1 = scanner.nextLine();
        while (!in1.equalsIgnoreCase("quit")){
            Superhero currentSuperhero = SuperheroFactory.getsuperhero(in1);
            if(currentSuperhero == null)
            {
                System.out.println("This superhero is not available, Pick another one.");
                in1 = scanner.nextLine();
                continue;
            }
            System.out.println("Please select an action for your desired superhero");
            String in2 = scanner.nextLine();
            while(!in2.equalsIgnoreCase("next"))

            {
                switch (in2) {
                    case "presentation" -> currentSuperhero.presentation();
                    case "saveme" -> currentSuperhero.saveme();
                    case "quit" -> {
                        System.out.println("Thank your for playing our simulation!");
                        return;
                    }
                    default ->
                            System.out.println("Incorrect spelling!\n" +
                                    "Try to write one of the actions available to you!");
                }
                in2 = scanner.nextLine();
            }
            System.out.print("Choose your superhero: ");
            in1 = scanner.nextLine();
        }
        System.out.println("Enjoy your day!");
    }
}
