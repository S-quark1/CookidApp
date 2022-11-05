package StrategyPattern.Behavior.SoundBehavior;

public class TalkBehavior implements IMakeSoundBehavior{
    @Override
    public String sound() {
        return "Talking...";
    }
}
