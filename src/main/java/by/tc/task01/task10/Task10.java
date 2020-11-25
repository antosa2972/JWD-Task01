package by.tc.task01.task10;
import java.util.HashMap;

public class Task10 {
    public static HashMap<Integer,Double> countFunctions(int a, int b, int h){
        HashMap<Integer,Double> foos= new HashMap<>();
        for(int x=a;x<=b;x+=h){
            foos.put(x,Math.tan(x));
        }
        return foos;
    }
}
