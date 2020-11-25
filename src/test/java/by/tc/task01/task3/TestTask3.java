package by.tc.task01.task3;
import org.junit.Assert;
import org.junit.Test;
public class TestTask3 {
    @Test
    public void getSquareTest1(){
        double actual=Task3.getSquare(36);
        double expected = 18;
        Assert.assertEquals(expected,actual,0.0);
    }
    @Test
    public void getSquareTest2(){
        double actual=Task3.getSquare(25);
        double expected = 12.5;
        Assert.assertEquals(expected,actual,0.0);
    }
    @Test
    public void getSquareTest3(){
        double actual=Task3.getSquare(25);
        double expected = 13;
        Assert.assertEquals(expected,actual,0.0);
    }
}
