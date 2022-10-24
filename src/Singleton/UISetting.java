package Singleton;

public class UISetting {

    public void start() {
        System.out.println("Welcome to Log File!");
        System.out.println("Runner Users' log are:\n");
        ProgramLogger.getProgramLogger().addLogInfo("First log...:\n");
        ProgramLogger.getProgramLogger().addLogInfo("Second log...:\n");
        ProgramLogger.getProgramLogger().ourHash(ProgramLogger.getProgramLogger().toString());


    ProgramLogger.getProgramLogger().showLogFile();

    }
}
