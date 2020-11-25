package by.tc.task01.task7;
import org.junit.Assert;
import org.junit.Test;
public class TestTask7 {
    @Test
    public void whichPointIsCloserTest1(){
        int actual=Task7.whichPointIsCloser(22,23,-1,-2);
        int expected =1;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void whichPointIsCloserTest2(){
        int actual=Task7.whichPointIsCloser(22,23,23,22);
        int expected =3;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void whichPointIsCloserTest3(){
        int actual=Task7.whichPointIsCloser(0,0,23,23);
        int expected =2;
        Assert.assertEquals(expected,actual);
    }
}
