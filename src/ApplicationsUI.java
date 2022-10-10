import FactoryPattern.Dish;
import FactoryPattern.PastaMammaMiaApp;

import java.util.Scanner;

public class ApplicationsUI {
    Scanner scanner = new Scanner(System.in);
    public void start() {
        System.out.println("\nCookid initializing....");
        System.out.println("Welcomen!");
        whileStatement:
        while (true){
            System.out.println("\nApp list:");
            System.out.println("1. PastaMammaMia Application");
            System.out.println("2. ********");
            System.out.println("3. ********");
            System.out.println("4. ********");
            System.out.println("5. ********");
            System.out.println("0. Turn off device");

            System.out.print("\nEnter option (1-5): ");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    PastaMammaMiaApp pastaMammaMiaApp = new PastaMammaMiaApp();
                    pastaMammaMiaApp.start();
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("App does not exists!");
                    break;
                case 0:
                    System.out.println("\nCookid shutdown....");
                    break whileStatement;
                default:
                    System.out.println("\nPlease, enter valid number or app does not exists");
                    break;
            }
            System.out.println("\n*************************");
        }
    }
}
