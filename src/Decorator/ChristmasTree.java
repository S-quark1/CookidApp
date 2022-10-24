package Decorator;

public abstract class ChristmasTree {
    String description="Unknown Tree";

    public String getDescription(){
        return description;
    }
    public abstract String color();
}
