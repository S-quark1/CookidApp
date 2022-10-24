package Decorator;
import java.util.Scanner;

public class Decomain {
    Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("\n Ho ho ho! Today we are going to choose our christmas tree and decorate it!\nBut remember that you will not be able to choose a decoration for a real Christmas tree!\n\n");

        whileStatement:
        while (true) {
            System.out.println("Please choose your Tree:\n");

            System.out.println("1. Real Christmas Tree");
            System.out.println("2. Fake Christmas Tree");
            System.out.println("0. Exit");

            System.out.print("\n Enter option (1 or 2): ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    ChristmasTree tree2 = new RealChristmasTree();
                    System.out.println("Good one! Your choice is " + tree2.getDescription()
                            + ", color:" + tree2.color());
                    System.out.println("No decoration here.\n");
                    break;
                case 2:
                    ChristmasTree tree1 = new FakeChristmasTree();
                    tree1 = new Tinsel(tree1);
                    tree1 = new Garland(tree1);
                    System.out.println("Good one! Your choice is " + tree1.getDescription()
                            + ", colors:" + tree1.color()+"\n");
                    break;
                case 0:
                    System.out.println("\nHappy New Year, my darling! see you later...");
                    break whileStatement;
                default:
                    System.out.println("\nPlease, enter a valid number");
                    break;
            }
        }
    }
}
