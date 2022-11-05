package StrategyPattern.Behavior.MoveBehavior;

public class CrawlBehavior implements IMoveBehavior{
    @Override
    public String move() {
        return "Crawling...";
    }
}
