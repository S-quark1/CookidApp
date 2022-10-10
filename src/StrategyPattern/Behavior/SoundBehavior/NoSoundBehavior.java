package StrategyPattern.Behavior.SoundBehavior;

public class NoSoundBehavior implements IMakeSoundBehavior{
    @Override
    public void sound() {
        System.out.println("No voice to...");
    }
}
