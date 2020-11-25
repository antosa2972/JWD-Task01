package by.tc.task01.task8;

public class Task8
{
    public static double getValueOfFoo(int x)
    {
        if(x >= 3)
            return (-Math.pow(x, 2)) + 3*x + 9;
        else return 1/(Math.pow(x, 3) - 6);
    }
}
