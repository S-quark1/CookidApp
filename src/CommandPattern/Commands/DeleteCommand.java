package CommandPattern.Commands;

import CommandPattern.Docs.Docs;

public class DeleteCommand implements ICommand{
    Docs docs;
    String word;

    public DeleteCommand(Docs docs, String word) {
        this.docs = docs;
        this.word = word;
    }

    @Override
    public void execute() {
        docs.delete(word);
    }

    @Override
    public void unexecute() {
        docs.save(word);
    }
}
