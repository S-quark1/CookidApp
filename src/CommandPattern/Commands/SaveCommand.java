package CommandPattern.Commands;

import CommandPattern.Docs.Docs;

public class SaveCommand implements ICommand{
    Docs docs;
    String word;

    public SaveCommand(Docs docs, String word) {
        this.docs = docs;
        this.word = word;
    }

    @Override
    public void execute() {
        System.out.println("executed");
        docs.save(word);
    }

    @Override
    public void unexecute() {
        docs.delete(word);
    }
}
