import CommandPattern.Docs.Docs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Cookid {
    public static void main(String[] args) {
        Docs docs = new Docs();
        docs.saveAll(new ArrayList<>(Arrays.asList("apple", "vomit")));

        LinkedList<String> words1 = docs.read();
        System.out.println("----------without saving---------");
        for (String w: words1) {
            System.out.print(w+" ");
        }

        docs.undoLast();
        docs.undoLast();
//        word.save(new ArrayList<>(Arrays.asList("rediska")));
        docs.saveToFile();

        LinkedList<String> words2 = docs.read();
        System.out.println("\n----------after save---------");
        for (String w: words2) {
            System.out.print(w+" ");
        }

//        ApplicationsUI applicationsUI = new ApplicationsUI();
//        applicationsUI.start();
    }
}
