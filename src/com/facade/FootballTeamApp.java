package com.facade;


import java.util.Scanner;

public class FootballTeamApp {
    public static void main(String[] args) {
        System.out.println("""
                This is our football team personal!
                To select a person please type his role(jucator/antrenor/finantator).
                Each of these 3 roles has a description.
                When you are done interacting with a person type next.
                If you want to exit our app type quit.""");
        Scanner scanner = new Scanner(System.in);
        TeamMaker teamMaker = new TeamMaker();
        System.out.println("Select a type of staff: ");
        String in = scanner.nextLine();
        while(!in.equalsIgnoreCase("quit")){
            if(in==null)
            {
                System.out.println("Personal necunoscut! Please try again.");
                in = scanner.nextLine();
                continue;
            }
            while(!in.equalsIgnoreCase("next")) {
                switch (in)
                {
                    case "jucator" -> teamMaker.descJucator();
                    case "antrenor" -> teamMaker.descAntrenor();
                    case "finantator" -> teamMaker.descFinantator();
                    case "quit" -> {
                        System.out.println("Thank you for viewing our team!");
                        return;
                    }
                    default -> System.out.println("Unknown Role!");
                }
                in = scanner.nextLine();
            }
            System.out.println("Type another role: ");
            in = scanner.nextLine();
        }
        System.out.println("Thank you for viewing our team!");
    }
}