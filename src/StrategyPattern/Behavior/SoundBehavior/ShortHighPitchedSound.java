package StrategyPattern.Behavior.SoundBehavior;

public class ShortHighPitchedSound implements IMakeSoundBehavior{
    @Override
    public String sound() {
        return "kkkkrk...";
    }
}
