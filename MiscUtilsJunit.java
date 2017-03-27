import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class MiscUtilsJunit
{
    @Test
    public void testMax()
    {
        int actual;
        
        actual = MiscUtils.max(1,2);
        assertEquals("1,2", 2, actual);
       
        actual = MiscUtils.max(2,1);
        assertEquals("2,1", 2, actual);        

        actual = MiscUtils.max(2,2);
        assertEquals("2,2", 2, actual);    

    }

    @Test
    public void testCalcGrade()
    {
        String actual;
        
        actual = MiscUtils.calcGrade(-10);
        assertEquals("-10", "", actual);
        
        actual = MiscUtils.calcGrade(25);
        assertEquals("25", "F", actual);

        actual = MiscUtils.calcGrade(55);
        assertEquals("55", "5", actual);

        actual = MiscUtils.calcGrade(65);
        assertEquals("65", "6", actual);

        actual = MiscUtils.calcGrade(75);
        assertEquals("75", "7", actual);

        actual = MiscUtils.calcGrade(85);
        assertEquals("85", "8", actual);

        actual = MiscUtils.calcGrade(95);
        assertEquals("95", "9", actual);

        actual = MiscUtils.calcGrade(100);
        assertEquals("100", "10", actual);

        actual = MiscUtils.calcGrade(110);
        assertEquals("110", "", actual);
    }
/*
    @Test
    public void testRoomArea()
    {

    }*/
}
