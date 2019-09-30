package com.ss.Test;
import com.ss.model.Line;
import org.junit.Test;

public class LineTest {



    @Test
    public void testSlope()
    {
        Line myLine = new Line(0,4,6,8);
        myLine.getSlope();
        System.out.println(myLine.getSlope());
    }
    @Test
    public void testDistance()
    {
        Line myLine = new Line(2,2,2,3);
        myLine.getDistance();
        System.out.println(myLine.getDistance());
    }
    @Test
    public void testParallel ()
    {
        Line myLine = new Line(4,3,3,4);
        Line myLine2 = new Line(-3,-4,-4,-3);
        myLine.parallelTo(myLine2);
        System.out.println(myLine.parallelTo(myLine2));
    }


}
