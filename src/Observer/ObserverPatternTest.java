package Observer;

import java.util.Observer;
import java.util.Scanner;

public class ObserverPatternTest {
    Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Good day! Please, enter your name(as in Moodle portal):\n");
        String name = scanner.nextLine();
        //create subject
        deansOffice topic = new deansOffice();

        //create observers
        IObserver obj1 = new Student(name);
        System.out.println("Halo,"+name+"!\n");
        //register observers to the subject
        topic.add(obj1);;

        //now send message to subject
        topic.postMessage("Schedule UPDATED FINALLY!");

        obj1.update();
    }

}
