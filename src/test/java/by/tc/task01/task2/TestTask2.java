package by.tc.task01.task2;
import org.junit.Assert;
import org.junit.Test;
public class TestTask2 {
    @Test
    public void getNumOfDaysOfMonthTest1(){
        int actual=Task2.getNumOfDaysOfMonth(2,2020);
        int expected=29;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getNumOfDaysOfMonthTest2(){
        int actual=Task2.getNumOfDaysOfMonth(8,2003);
        int expected=30;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getNumOfDaysOfMonthTest3(){
        int actual=Task2.getNumOfDaysOfMonth(12,3000);
        int expected=31;
        Assert.assertEquals(expected,actual);
    }
}
