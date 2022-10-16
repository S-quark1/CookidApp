package StrategyPattern;

import FactoryPattern.Dish;
import FactoryPattern.Kitchen;
import StrategyPattern.Robots.Robot;

import java.util.Scanner;

public class RobotsShowoffApp {
    Scanner scanner = new Scanner(System.in);
    RobotAssembler rb = new RobotAssembler();

    public void start() {
        Robot robot = null;
        whileStatement:
        while (true) {
            System.out.println("\nIt's Robots Showoff!\nChoose your robot and let random jury decide!\n");
            System.out.println("1. Dancing Robot");
            System.out.println("2. Mechanic Robot");
            System.out.println("3. Spider Robot");
            System.out.println("4. Swimming Robot");
            System.out.println("5. Toy Robot");
            System.out.println("6. Wooden Robot");
            System.out.println("0. Exit");

            System.out.print("\nEnter option (1-5): ");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    robot = rb.createDancing();
                    break;
                case 2:
                    robot = rb.createMechanic();
                    break;
                case 3:
                    robot = rb.createSpider();
                    break;
                case 4:
                    robot = rb.createSwimming();
                    break;
                case 5:
                    robot = rb.createToy();
                    break;
                case 6:
                    robot = rb.createWooden();
                    break;
                case 0:
                    System.out.println("\nClosing application...");
                    break whileStatement;
                default:
                    System.out.println("\nPlease, enter a valid number");
                    break;
            }

            if (robot != null) {
                robot.display();
                robot.move();
                robot.sound();

                int random_int = (int) Math.floor(Math.random() * (11));
                System.out.print("\nOur jury says " + random_int + "/10");
            }

            System.out.println("\n*************************");
        }
    }
}
