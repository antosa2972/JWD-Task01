package by.tc.task01.task5;

public class Task5 {
    public static boolean isPerfect(int num){
        if(num<=0)
            return false;
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0)
                sum+=i;
        }
        return sum==num;
    }
}
