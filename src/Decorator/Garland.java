package Decorator;

public class Garland extends TreeDecorator {
    public Garland(ChristmasTree garland) {
        this.tree = garland;
    }

    public String color() {
        String color=tree.color();
        return tree.color()+" + 2) black";
    }

    public String getDescription() {
        return tree.getDescription()+" + 2) Garland";
    }
}
