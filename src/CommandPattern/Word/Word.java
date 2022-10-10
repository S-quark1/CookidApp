package CommandPattern.Word;

import java.io.*;
import java.util.Collection;
import java.util.LinkedList;

public class Word {
    LinkedList<String> linkedList;

    public Word() {
        this.linkedList = new LinkedList<>();
    }

    public void save(Collection<String> words) {
        linkedList.addAll(words);
    }

    public void saveToFile(){
        writeFile();
        this.linkedList = new LinkedList<>();
    }

    public LinkedList<String> read() {
        LinkedList<String> temp = readFile();
        if (temp == null) return linkedList;

        temp.addAll(linkedList);
        return temp;
    }

    public void delete(String word) {
        if (linkedList.isEmpty()) return;
        linkedList.removeLastOccurrence(word);
    }

    public void undoLast() {
        if (linkedList.isEmpty()) return;
        linkedList.removeLast();
    }

    private boolean isEmpty() {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("docs.txt"));
            boolean a = br.readLine() == null;
            br.close();
            return a;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private LinkedList<String> readFile() {
        if (isEmpty()) return null;

        try {
            FileInputStream fin = new FileInputStream("docs.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
            LinkedList<String> a = (LinkedList<String>) in.readObject();
            in.close();
            return a;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void writeFile() {
        try {
            LinkedList<String> a = read();
            FileOutputStream fout = new FileOutputStream("docs.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(a);
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
