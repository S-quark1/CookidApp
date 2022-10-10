package StrategyPattern.Behavior.SoundBehavior;

public class TalkBehavior implements IMakeSoundBehavior{
    @Override
    public void sound() {
        System.out.println("Talking...");
    }
}
