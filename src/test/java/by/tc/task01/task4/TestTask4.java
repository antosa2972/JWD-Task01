package by.tc.task01.task4;
import org.junit.Assert;
import org.junit.Test;
public class TestTask4 {
    @Test
    public void isTwoParityTest1(){
        boolean actual=Task4.isTwoParity(1,2,3,4);
        Assert.assertTrue(actual);
    }
    @Test
    public void isTwoParityTest2(){
        boolean actual=Task4.isTwoParity(10,21,3,53);
        Assert.assertFalse(actual);
    }
    @Test
    public void isTwoParityTest3(){
        boolean actual=Task4.isTwoParity(10,22,32,53);
        Assert.assertTrue(actual);
    }
}
