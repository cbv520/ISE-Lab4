public class MiscUtilsTest
{
    public static void main(String args[])
    {
        testMax();
        testCalcGrade();
    }

    public static void testMax()
    {
        int actual;
        
        actual = MiscUtils.max(1,2);
        assert actual == 2 : "testMax test 1 failed";
       
        actual = MiscUtils.max(2,1);
        assert actual == 2 : "testMax test 2 failed";        

        actual = MiscUtils.max(2,2);
        assert actual == 2 : "testMax test 3 failed";    

    }

    public static void testCalcGrade()
    {
        String actual;
        
        actual = MiscUtils.calcGrade(-10);
        assert actual.equals("") : "testCalcGrade test 1 failed";
        
        actual = MiscUtils.calcGrade(25);
        assert actual.equals("F") : "testCalcGrade test 2 failed";

        actual = MiscUtils.calcGrade(55);
        assert actual.equals("5") : "testCalcGrade test 3 failed";

        actual = MiscUtils.calcGrade(65);
        assert actual.equals("6") : "testCalcGrade test 4 failed";

        actual = MiscUtils.calcGrade(75);
        assert actual.equals("7") : "testCalcGrade test 5 failed";

        actual = MiscUtils.calcGrade(85);
        assert actual.equals("8") : "testCalcGrade test 6 failed";

        actual = MiscUtils.calcGrade(95);
        assert actual.equals("9") : "testCalcGrade test 7 failed";

        actual = MiscUtils.calcGrade(100);
        assert actual.equals("10") : "testCalcGrade test 8 failed";

        actual = MiscUtils.calcGrade(110);
        assert actual.equals("") : "testCalcGrade test 9 failed";
    }

    public static void testRoomArea()
    {

    }
}
