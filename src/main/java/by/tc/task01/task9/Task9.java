package by.tc.task01.task9;

public class Task9 {
    public static double countSquare(double rad){
        if(rad<=0)
            return 0xFFFFFFFF;
        return 3.14*Math.pow(rad,2);
    }
    public static double countLength(double rad){
        if(rad<=0)
            return 0xFFFFFFFF;
        return 2*3.14*rad;
    }
}
