package StrategyPattern.Behavior.SoundBehavior;

public class SingBehavior implements IMakeSoundBehavior{
    @Override
    public void sound() {
        System.out.println("Singing...");
    }
}
