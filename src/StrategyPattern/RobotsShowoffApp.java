package StrategyPattern;

import StrategyPattern.Robots.Robot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RobotsShowoffApp {
    Scanner scanner = new Scanner(System.in);
    RobotAssembler rb = new RobotAssembler();
    Map<Robot, Integer> map = new HashMap<>();

    public void start() {
        Robot robot = null;
        whileStatement:
        while (true) {
            System.out.println("\nIt's Robots Showoff!\nCreate your own robot and let the jury decide!\n");
            System.out.println("1. Create Robot");
            System.out.println("2. Show my collection");
            System.out.println("0. Exit");

            System.out.print("\nEnter option (1-2): ");

            String option = scanner.next();
            switch (option) {
                case "1":
                    robot = robotCreation();
                    break;
                case "2":
                    System.out.println("My robot collection:\n");
                    for (Map.Entry<Robot, Integer> entry : map.entrySet()) {
                        System.out.println(entry.getKey().getName() + " - " + entry.getValue() + "/10");
                    }
                    break;
                case "0":
                    System.out.println("\nClosing application...");
                    break whileStatement;
                default:
                    System.out.println("\nPlease, enter a valid number");
                    break;
            }

            if (robot != null) {
                System.out.println(robot.getName());
                robot.display();
                robot.move();
                robot.sound();

                int random_int = (int) Math.floor(Math.random() * (11));
                map.put(robot, random_int);
                robot = null;
                System.out.print("\nOur jury says " + random_int + "/10");
            }

            System.out.println("\n*************************");
        }
    }

    private Robot robotCreation() {
        Robot robot = null;
        whileStatement:
        while (true) {
            System.out.println("\nIt's Robots Showoff!\nChoose the type of Robot\n");
            System.out.println("1. Dancing Robot");
            System.out.println("2. Mechanic Robot");
            System.out.println("3. Spider Robot");
            System.out.println("4. Swimming Robot");
            System.out.println("5. Toy Robot");
            System.out.println("6. Wooden Robot");
            System.out.println("0. Exit");

            System.out.print("\nEnter option (1-6): ");

            String option = scanner.next();
            switch (option) {
                case "1":
                    robot = rb.createDancing();
                    break whileStatement;
                case "2":
                    robot = rb.createMechanic();
                    break whileStatement;
                case "3":
                    robot = rb.createSpider();
                    break whileStatement;
                case "4":
                    robot = rb.createSwimming();
                    break whileStatement;
                case "5":
                    robot = rb.createToy();
                    break whileStatement;
                case "6":
                    robot = rb.createWooden();
                    break whileStatement;
                case "0":
                    System.out.println("\nLoading...");
                    break whileStatement;
                default:
                    System.out.println("\nPlease, enter a valid number");
                    break;
            }
            System.out.println("\n*************************");
        }
        return robot;
    }
}
