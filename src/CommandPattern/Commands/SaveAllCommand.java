package CommandPattern.Commands;

import CommandPattern.Docs.Docs;

import java.util.Collection;

public class SaveAllCommand implements ICommand{
    Docs docs;
    Collection<String> words;

    public SaveAllCommand(Docs docs, Collection<String> words) {
        this.docs = docs;
        this.words = words;
    }

    @Override
    public void execute() {
        docs.saveAll(words);
    }

    @Override
    public void unexecute() {
        for (String word: words) {
            docs.delete(word);
        }
    }
}
