package CommandPattern;

import CommandPattern.Commands.*;
import CommandPattern.Docs.Docs;
import CommandPattern.Invoker;

import java.util.Arrays;
import java.util.Scanner;

public class DocsApp {
    Scanner scanner = new Scanner(System.in);
    private final Docs docs = new Docs();
    private final Invoker invoker = new Invoker();

    public void start() {
        whileStatement:
        while (true) {
            System.out.println("\nDocs Application (demo)\n");
            System.out.println("1. Read File");
            System.out.println("2. Save new sentences");
            System.out.println("3. Undo last");
            System.out.println("4. Save everything (cannot edit later)");
            System.out.println("0. Exit");

            System.out.print("\nEnter option (1-5): ");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    invoker.readFile(new ReadCommand(docs));
                    break;
                case 2:
                    System.out.println("enter: ");
                    scanner.nextLine(); // who knew that "nextInt() does not consume the '\n', so the next call to nextLine() consumes it"
                    String currentSentence = scanner.nextLine();
                    invoker.saveNewSentence(new SaveAllCommand(docs, Arrays.asList(currentSentence.split("\\s+"))));
                    break;
                case 3:
                    invoker.undoLastWord(new UndoLastCommand(docs));
                    break;
                case 4:
                    invoker.saveToFile(new SaveToFileCommand(docs));
                    break;
                case 0:
                    System.out.println("\nClosing application...");
                    break whileStatement;
                default:
                    System.out.println("\nPlease, enter a valid number");
                    break;
            }
            System.out.println("\n*************************");
        }
    }
}
