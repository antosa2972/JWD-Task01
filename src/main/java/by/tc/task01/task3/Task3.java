package by.tc.task01.task3;
public class Task3 {
    public static double getSquare(double square1){
        if(square1<=0)
            return 0xFFFFFFFF;
        double square2=0;
        square2=Math.pow(Math.sqrt(square1),2);
        square2/=2;
        return square2;
    }
}
