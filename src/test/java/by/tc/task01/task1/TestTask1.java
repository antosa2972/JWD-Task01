package by.tc.task01.task1;
import org.junit.Assert;
import org.junit.Test;
public class TestTask1 {
    @Test
    public void getLastNumOfSquareTest1(){
        int actual=Task1.getLastNumOfSquare(5);
        int expected=5;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getLastNumOfSquareTest2(){
        int actual1=Task1.getLastNumOfSquare(-13);
        int expected1=-9;
        Assert.assertEquals(expected1,actual1);
    }

}
