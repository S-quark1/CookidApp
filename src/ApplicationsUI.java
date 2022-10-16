import CommandPattern.DocsApp;
import FactoryPattern.PastaMammaMiaApp;
import StrategyPattern.RobotsShowoffApp;

import java.util.Scanner;

public class ApplicationsUI {
    Scanner scanner = new Scanner(System.in);
    public void start() {
        System.out.println("\nCookid initializing....");
        System.out.println("Welcomen!");
        whileStatement:
        while (true){
            System.out.println("\nApp list:");
            System.out.println("1. PastaMammaMia App            -- Factory Pattern");
            System.out.println("2. Docs Application (demo)      -- Command Pattern");
            System.out.println("3. Robots Showoff               -- Strategy Pattern");
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
                    DocsApp docsApp = new DocsApp();
                    docsApp.start();
                    break;
                case 3:
                    RobotsShowoffApp robotsShowoffApp = new RobotsShowoffApp();
                    robotsShowoffApp.start();
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
