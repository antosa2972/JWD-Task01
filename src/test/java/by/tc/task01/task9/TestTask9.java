package by.tc.task01.task9;
import org.junit.Assert;
import org.junit.Test;
public class TestTask9 {
    @Test
    public void countLengthTest(){
        double actual = Task9.countLength(4);
        double expected =25.12;
        Assert.assertEquals(expected,actual,0.0);
    }
    @Test
    public void countSquareTest(){
        double actual = Task9.countSquare(5);
        double expected =78.5;
        Assert.assertEquals(expected,actual,0.0);
    }
    @Test
    public void countSquareTest2(){
        double actual = Task9.countSquare(-5);
        double expected =78.5;
        Assert.assertEquals(expected,actual,0.0);
    }

}
