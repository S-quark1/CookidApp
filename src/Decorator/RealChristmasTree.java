package Decorator;

public class RealChristmasTree extends ChristmasTree{
    public RealChristmasTree(){
        description="Real Christmas Tree";
    }

    @Override
    public String color() {
        return " green" ;
    }
}
