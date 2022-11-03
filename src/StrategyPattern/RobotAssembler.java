package StrategyPattern;

import StrategyPattern.Behavior.MoveBehavior.*;
import StrategyPattern.Behavior.SoundBehavior.*;
import StrategyPattern.Robots.*;

import java.util.Scanner;

public class RobotAssembler {
    Scanner scanner = new Scanner(System.in);
    IMakeSoundBehavior makeSoundBehavior;
    IMoveBehavior moveBehavior;
    public Robot createDancing(){
        System.out.println("\nIt's Robots Showoff!\nChoose the abilities\n");
        whileStatement:
        while (true) {
            System.out.println("Voice abilities: ");
            System.out.println("1. Sing");
            System.out.println("2. Silence");

            String option = scanner.next();
            switch (option) {
                case "1":
                    makeSoundBehavior = new SingBehavior();
                    break whileStatement;
                case "2":
                    makeSoundBehavior = new NoSoundBehavior();
                    break whileStatement;
                default:
                    System.out.println("\nPlease, enter a valid number");
                    break;
            }
        }

        while (true) {
            System.out.println("Move abilities: ");
            System.out.println("1. Dance");

            String option = scanner.next();
            if ("1".equals(option)) {
                moveBehavior = new DanceBehavior();
                break;
            } else {
                System.out.println("\nPlease, enter a valid number");
            }
        }
        return new DancingRobot(moveBehavior, makeSoundBehavior);
    }

    public Robot createMechanic(){
        System.out.println("\nIt's Robots Showoff!\nChoose the abilities\n");
        whileStatement:
        while (true) {
            System.out.println("Voice abilities: ");
            System.out.println("1. Talk");
            System.out.println("2. Short High Pitched Sound");
            System.out.println("3. Silence");

            String option = scanner.next();
            switch (option) {
                case "1":
                    makeSoundBehavior = new TalkBehavior();
                    break whileStatement;
                case "2":
                    makeSoundBehavior = new ShortHighPitchedSound();
                    break whileStatement;
                case "3":
                    makeSoundBehavior = new NoSoundBehavior();
                    break whileStatement;
                default:
                    System.out.println("\nPlease, enter a valid number");
                    break;
            }
        }

        whileStatement:
        while (true) {
            System.out.println("Move abilities: ");
            System.out.println("1. Walk");
            System.out.println("2. No movement");

            String option = scanner.next();
            switch (option) {
                case "1":
                    moveBehavior = new WalkBehavior();
                    break whileStatement;
                case "2":
                    moveBehavior = new NoMoveBehavior();
                    break whileStatement;
                default:
                    System.out.println("\nPlease, enter a valid number");
                    break;
            }
        }
        return new MechanicRobot(moveBehavior, makeSoundBehavior);
    }

    public Robot createSpider(){
        System.out.println("\nIt's Robots Showoff!\nChoose the abilities\n");
        whileStatement:
        while (true) {
            System.out.println("Voice abilities: ");
            System.out.println("1. Silence");
            System.out.println("2. Short High Pitched Sound");

            String option = scanner.next();
            switch (option) {
                case "1":
                    makeSoundBehavior = new NoSoundBehavior();
                    break whileStatement;
                case "2":
                    makeSoundBehavior = new ShortHighPitchedSound();
                    break whileStatement;
                default:
                    System.out.println("\nPlease, enter a valid number");
                    break;
            }
        }

        whileStatement:
        while (true) {
            System.out.println("Move abilities: ");
            System.out.println("1. Crawl");
            System.out.println("2. No movement");

            String option = scanner.next();
            switch (option) {
                case "1":
                    moveBehavior = new CrawlBehavior();
                    break whileStatement;
                case "2":
                    moveBehavior = new NoMoveBehavior();
                    break whileStatement;
                default:
                    System.out.println("\nPlease, enter a valid number");
                    break;
            }
        }
        return new SpiderRobot(moveBehavior, makeSoundBehavior);
    }

    public Robot createSwimming(){
        System.out.println("\nIt's Robots Showoff!\nChoose the abilities\n");
        whileStatement:
        while (true) {
            System.out.println("Voice abilities: ");
            System.out.println("1. Silence");

            String option = scanner.next();
            switch (option) {
                case "1":
                    makeSoundBehavior = new NoSoundBehavior();
                    break whileStatement;
                default:
                    System.out.println("\nPlease, enter a valid number");
                    break;
            }
        }

        whileStatement:
        while (true) {
            System.out.println("Move abilities: ");
            System.out.println("1. Swimming");

            String option = scanner.next();
            switch (option) {
                case "1":
                    moveBehavior = new SwimBehavior();
                    break whileStatement;
                default:
                    System.out.println("\nPlease, enter a valid number");
                    break;
            }
        }
        return new SwimmingRobot(moveBehavior, makeSoundBehavior);
    }

    public Robot createToy(){
        System.out.println("\nIt's Robots Showoff!\nChoose the abilities\n");
        whileStatement:
        while (true) {
            System.out.println("Voice abilities: ");
            System.out.println("1. Singing");
            System.out.println("2. Short High Pitched Sound");
            System.out.println("3. Talk");

            String option = scanner.next();
            switch (option) {
                case "1":
                    makeSoundBehavior = new SingBehavior();
                    break whileStatement;
                case "2":
                    makeSoundBehavior = new ShortHighPitchedSound();
                    break whileStatement;
                case "3":
                    makeSoundBehavior = new TalkBehavior();
                    break whileStatement;
                default:
                    System.out.println("\nPlease, enter a valid number");
                    break;
            }
        }

        whileStatement:
        while (true) {
            System.out.println("Move abilities: ");
            System.out.println("1. No movement");

            String option = scanner.next();
            switch (option) {
                case "1":
                    moveBehavior = new NoMoveBehavior();
                    break whileStatement;
                default:
                    System.out.println("\nPlease, enter a valid number");
                    break;
            }
        }
        return new ToyRobot(moveBehavior, makeSoundBehavior);
    }

    public Robot createWooden(){
        System.out.println("\nIt's Robots Showoff!\nChoose the abilities\n");
        whileStatement:
        while (true) {
            System.out.println("Voice abilities: ");
            System.out.println("1. Silence");

            String option = scanner.next();
            switch (option) {
                case "1":
                    makeSoundBehavior = new NoSoundBehavior();
                    break whileStatement;
                default:
                    System.out.println("\nPlease, enter a valid number");
                    break;
            }
        }

        whileStatement:
        while (true) {
            System.out.println("Move abilities: ");
            System.out.println("1. No movement");

            String option = scanner.next();
            switch (option) {
                case "1":
                    moveBehavior = new NoMoveBehavior();
                    break whileStatement;
                default:
                    System.out.println("\nPlease, enter a valid number");
                    break;
            }
        }
        return new WoodenRobot(moveBehavior, makeSoundBehavior);
    }
}
