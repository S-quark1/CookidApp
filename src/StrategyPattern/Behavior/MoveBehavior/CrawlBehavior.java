package StrategyPattern.Behavior.MoveBehavior;

public class CrawlBehavior implements IMoveBehavior{
    @Override
    public void move() {
        System.out.println("Crawling...");
    }
}
