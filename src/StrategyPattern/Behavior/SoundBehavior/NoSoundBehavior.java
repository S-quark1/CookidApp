package StrategyPattern.Behavior.SoundBehavior;

public class NoSoundBehavior implements IMakeSoundBehavior{
    @Override
    public String sound() {
        return "No voice to...";
    }
}
