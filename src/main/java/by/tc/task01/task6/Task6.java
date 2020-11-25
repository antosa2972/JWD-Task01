package by.tc.task01.task6;

public class Task6 {
    public static String getTime(int seconds){
        if(seconds<0||seconds>=86400) return "";
        int hour=seconds/3600;
        int min=(seconds-hour*3600)/60;
        int scnd=seconds-hour*3600-min*60;
        return hour+":"+min+":"+scnd;
    }
}
