package by.tc.task01.task7;

public class Task7 {
    public static int whichPointIsCloser(double x1,double y1,double x2,double y2){
        double r1=Math.sqrt(x1*x1+y1*y1);
        double r2=Math.sqrt(x2*x2+y2*y2);
        if(r1>r2)
            return 1;
        if(r1<r2)
            return 2;
        return 3;
    }
}
