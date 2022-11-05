package StrategyPattern.Behavior.SoundBehavior;

public class SingBehavior implements IMakeSoundBehavior{
    @Override
    public String sound() {
        return "Singing...";
    }
}
