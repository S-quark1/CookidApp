package Decorator;

public class FakeChristmasTree extends ChristmasTree{
    public FakeChristmasTree(){
        description="Fake Christmas Tree";
    }

    @Override
    public String color() {
        return " yellow";
    }
}
