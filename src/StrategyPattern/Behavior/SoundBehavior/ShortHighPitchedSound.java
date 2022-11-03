package StrategyPattern.Behavior.SoundBehavior;

public class ShortHighPitchedSound implements IMakeSoundBehavior{
    @Override
    public void sound() {
        System.out.println("kkkkrk...");
    }
}
