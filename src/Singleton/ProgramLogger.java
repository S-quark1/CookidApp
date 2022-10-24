package Singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile="This is log File! Have only one address! \n\n";

    public static synchronized ProgramLogger getProgramLogger(){
        if(programLogger == null){
            programLogger=new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger(){}
    public void addLogInfo(String logInfo){
        System.out.println(logInfo);

    }

    public void ourHash(String ourhash){
        logFile+=ourhash;
    }
    public void showLogFile(){
        System.out.println(logFile);
    }


}
