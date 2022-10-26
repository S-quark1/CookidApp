package Observer;

import java.util.Observable;

public class Student implements IObserver{
    private String topic;
    private String name;

    @Override
    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Student(String name){
        this.name=name;
    }
    @Override
    public void update() {
        String msg = topic.toString();
        if(msg == null){
            System.out.println(name+" :: No new message");
        }else
            System.out.println(name+" :: Consuming message is :: "+msg);
    }
}
