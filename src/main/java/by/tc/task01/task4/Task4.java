package by.tc.task01.task4;
public class Task4 {
    public static boolean isTwoParity(int a,int b,int c,int d){
        int counter=0;
        if(a%2==0)
            counter++;
        if(b%2==0)
            counter++;
        if(c%2==0)
            counter++;
        if(d%2==0)
            counter++;
        return counter >= 2;
    }
}
