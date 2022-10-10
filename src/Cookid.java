import CommandPattern.Word.Word;
import FactoryPattern.PastaMammaMiaApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class Cookid {
    public static void main(String[] args) {
        Word word = new Word();
        word.save(new ArrayList<>(Arrays.asList("apple", "vomit")));

        LinkedList<String> words1 = word.read();
        System.out.println("----------without saving---------");
        for (String w: words1) {
            System.out.print(w+" ");
        }

        word.undoLast();
        word.undoLast();
//        word.save(new ArrayList<>(Arrays.asList("rediska")));
        word.saveToFile();

        LinkedList<String> words2 = word.read();
        System.out.println("\n----------after save---------");
        for (String w: words2) {
            System.out.print(w+" ");
        }

//        ApplicationsUI applicationsUI = new ApplicationsUI();
//        applicationsUI.start();
    }
}
