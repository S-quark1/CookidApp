package Decorator;

public class Tinsel extends TreeDecorator {
    public Tinsel(ChristmasTree b){
        this.tree=b;
    }

    @Override
    public String getDescription() {
        return tree.getDescription()+" + 1) Tinsel";
    }

    @Override
    public String color() {
        return tree.color()+" + 1) purple";
    }
}
