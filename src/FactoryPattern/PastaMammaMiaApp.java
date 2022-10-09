package FactoryPattern;

import java.util.Scanner;

public class Waiter {
    Scanner scanner = new Scanner(System.in);
    Kitchen kitchen = new Kitchen();
    public void start() {
        Dish dish = null;
        while (true){
            System.out.println();
            System.out.println("Welcome to Pasta Mamma Mia App!\nWhat would you like to order?");
            System.out.println("1. Spaghetti Bolognese");
            System.out.println("2. Cheese Lasagne");
            System.out.println("3. Macaroni and Cheese");
            System.out.println("4. Macaroni Bolognese");
            System.out.println("5. Spaghetti Carbonara");
            System.out.println("0. Exit");

            System.out.print("Enter option (1-5): ");

            int option = scanner.nextInt();
            if (option == 1) {
                dish = kitchen.createPasta(1,1, "Spaghetti Bolognese");
            } else if (option == 2) {
                dish = kitchen.createPasta(2,2, "Cheese Lasagne");
            } else if (option == 3) {
                dish = kitchen.createPasta(3,2, "Macaroni and Cheese");
            } else if (option == 4) {
                dish = kitchen.createPasta(3,1, "Macaroni Bolognese");
            } else if (option == 5) {
                dish = kitchen.createPasta(1,3, "Spaghetti Carbonara");
            } else if (option == 0) {
                System.out.println("Closing application...");
                break;
            } else {
                System.out.println("Please, enter a valid number");
            }

            System.out.println("\n*************************");
            if (dish!=null){
                System.out.println("Your order will come soon!: " + dish.toString());
            }
        }

    }
}
