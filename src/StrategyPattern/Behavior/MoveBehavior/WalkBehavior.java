package StrategyPattern.Behavior.MoveBehavior;

public class WalkBehavior implements IMoveBehavior{
    @Override
    public String move() {
        return "Walking...";
    }
}
