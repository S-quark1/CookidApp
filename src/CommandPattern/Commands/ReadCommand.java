package CommandPattern.Commands;

import CommandPattern.Docs.Docs;

import java.util.LinkedList;

public class ReadCommand implements ICommand {
    Docs docs;

    public ReadCommand(Docs docs) {
        this.docs = docs;
    }

    @Override
    public void execute() {
        LinkedList<String> words = docs.read();
        for (String w : words) {
            System.out.print(w + " ");
        }
        System.out.println();
    }

    @Override
    public void unexecute() {
        LinkedList<String> words = docs.read();
        for (int i = words.size() - 1; i >= 0; i--) {
            System.out.print(words.get(i) + " ");
        }
        System.out.println();
    }
}
