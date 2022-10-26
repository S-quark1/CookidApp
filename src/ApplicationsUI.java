import CommandPattern.DocsApp;
import Decorator.Decomain;
import FactoryPattern.PastaMammaMiaApp;
import Observer.ObserverPatternTest;
import Singleton.UISetting;
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
            System.out.println("1. Robots Showoff               -- Strategy Pattern");
            System.out.println("2. IMEI settings                -- Singleton Pattern");
            System.out.println("3. PastaMammaMia App            -- Factory Pattern");
            System.out.println("4. Christmas tree               -- Decorator Pattern");
            System.out.println("5. Docs Application (demo)      -- Command Pattern");
            System.out.println("6. Moodle                       -- Observer Pattern");
            System.out.println("0. Turn off device");

            System.out.print("\nEnter option (1-5): ");

            String option = scanner.next();
            switch (option) {
                case "1":
                    RobotsShowoffApp robotsShowoffApp = new RobotsShowoffApp();
                    robotsShowoffApp.start();
                    break;
                case "2":
                    UISetting uiSetting = new UISetting();
                    uiSetting.start();
                    break;
                case "3":
                    PastaMammaMiaApp pastaMammaMiaApp = new PastaMammaMiaApp();
                    pastaMammaMiaApp.start();
                    break;
                case "4":
                    Decomain decomain = new Decomain();
                    decomain.start();
                    break;
                case "5":
                    DocsApp docsApp = new DocsApp();
                    docsApp.start();
                    break;
                case "6":
                    ObserverPatternTest observerPatternTest = new ObserverPatternTest();
                    observerPatternTest.start();
                    break;
                case "0":
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
