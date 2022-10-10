package CommandPattern.Commands;

import CommandPattern.Docs.Docs;

import java.util.Collection;

public class SaveToFileCommand implements ICommand{
    Docs docs;
    Collection<String> words;

    public SaveToFileCommand(Docs docs) {
        this.docs = docs;
    }

    @Override
    public void execute() {
        docs.saveToFile();
    }

    @Override
    public void unexecute() {

    }
}
