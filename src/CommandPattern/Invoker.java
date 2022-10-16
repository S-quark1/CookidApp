package CommandPattern;

import CommandPattern.Commands.ICommand;

public class Invoker {
//    ICommand undoLastWordCommand;
//    ICommand saveNewWordCommand;
//    ICommand saveNewWordListCommand;
//    ICommand saveToFileCommand;
//    ICommand readFileCommand;
//
//    public Invoker(ICommand undoLastWord, ICommand saveNewWord, ICommand saveNewWordList, ICommand saveToFile, ICommand readFile) {
//        this.undoLastWordCommand = undoLastWord;
//        this.saveNewWordCommand = saveNewWord;
//        this.saveNewWordListCommand = saveNewWordList;
//        this.saveToFileCommand = saveToFile;
//        this.readFileCommand = readFile;
//    }

    public Invoker() {
    }

    public void undoLastWord(ICommand undoLastWord){
        undoLastWord.execute();
    }

    public void saveNewWord(ICommand saveNewWord){
        saveNewWord.execute();
    }

    public void saveNewSentence(ICommand saveNewWordList){
        saveNewWordList.execute();
    }

    public void saveToFile(ICommand saveToFile){
        saveToFile.execute();
    }

    public void readFile(ICommand readFile){
        readFile.execute();
    }
}
