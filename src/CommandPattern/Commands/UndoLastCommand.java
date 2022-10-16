package CommandPattern.Commands;

import CommandPattern.Docs.Docs;

public class UndoLastCommand implements ICommand{
    Docs docs;
    String UndoneWord;

    public UndoLastCommand(Docs docs) {
        this.docs = docs;
    }

    @Override
    public void execute() {
        this.UndoneWord = docs.undoLast();
    }

    @Override
    public void unexecute() {
        docs.save(UndoneWord);
    }
}

