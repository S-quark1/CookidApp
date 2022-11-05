package StrategyPattern.Behavior.MoveBehavior;

public class DanceBehavior implements IMoveBehavior{
    @Override
    public String move() {
        return "Dancing...";
    }
}
