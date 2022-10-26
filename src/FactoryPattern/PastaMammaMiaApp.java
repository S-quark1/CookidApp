package FactoryPattern;

import java.util.Scanner;

public class PastaMammaMiaApp {
    Scanner scanner = new Scanner(System.in);
    Kitchen kitchen = new Kitchen();

    public void start() {
        Dish dish = null;
        whileStatement:
        while (true) {
            System.out.println("\nWelcome to Pasta Mamma Mia App!\nWhat would you like to order?\n");
            System.out.println("1. Spaghetti Bolognese");
            System.out.println("2. Cheese Lasagne");
            System.out.println("3. Macaroni and Cheese");
            System.out.println("4. Macaroni Bolognese");
            System.out.println("5. Spaghetti Carbonara");
            System.out.println("0. Exit");

            System.out.print("\nEnter option (1-5): ");

            String option = scanner.next();
            switch (option) {
                case "1":
                    dish = kitchen.createPasta(1, 1, "Spaghetti Bolognese");
                    break;
                case "2":
                    dish = kitchen.createPasta(2, 2, "Cheese Lasagne");
                    break;
                case "3":
                    dish = kitchen.createPasta(3, 2, "Macaroni and Cheese");
                    break;
                case "4":
                    dish = kitchen.createPasta(3, 1, "Macaroni Bolognese");
                    break;
                case "5":
                    dish = kitchen.createPasta(1, 3, "Spaghetti Carbonara");
                    break;
                case "0":
                    System.out.println("\nClosing application...");
                    break whileStatement;
                default:
                    System.out.println("\nPlease, enter a valid number");
                    break;
            }
            System.out.println("\n*************************");
            if (dish != null) {
                System.out.println("Your order will come soon!: " + dish.toString());
            }
        }
    }
}
