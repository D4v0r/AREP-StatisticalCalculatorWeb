package edu.escuelaing.arep;



import edu.escuelaing.arep.calculators.CalculatorException;
import edu.escuelaing.arep.calculators.StatisticalCalculator;
import edu.escuelaing.arep.collections.LinkedList;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for  Statistical calculator.
 *
 * @author  Davor Cortes
 * @version 1.0
 */
public class StatisticalCalculatorTest extends TestCase {

    private static StatisticalCalculator calculator = new StatisticalCalculator();

    /**
     * Instantiates a new Statistical calculator test.
     *
     * @param testName the test name
     */
    public StatisticalCalculatorTest(String testName){
        super(testName);
    }

    /**
     * Suite test.
     *
     * @return the test
     */
    public static Test suite()
    {
        TestSuite suite = new TestSuite( );
        suite.addTest(new StatisticalCalculatorTest("statisticalCalculationTest1"));
        suite.addTest(new StatisticalCalculatorTest("statisticalCalculationTest2"));
        suite.addTest(new StatisticalCalculatorTest("statisticalCalculationFailure"));
        return suite;
    }

    /**
     * Statistical calculation test
     * Test for column 1.
     */
    public static void statisticalCalculationTest1(){
        String[] estimateProxySize = {"160", "591", "114", "229", "230", "270", "128", "1657", "624", "1503"};
        LinkedList<Double> dataList = new LinkedList<>();
        for (String x:estimateProxySize
        ) {
            Double number = Double.parseDouble(x);
            dataList.add(number);
        }
        calculator.putData(dataList);
        try {
            assertTrue(calculator.mean()== 550.6 && calculator.standarDeviation() == 572.03);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Statistical calculation test 2
     * Test for column 2.
     */
    public static void statisticalCalculationTest2(){
        String[] developmentHours = {"15.0", " 69.9",  "6.5",  "22.4", "28.4", "65.9", "19.4", "198.7", "38.8", "138.2"};
        LinkedList<Double> dataList = new LinkedList<>();
        for (String x:developmentHours
        ) {
            Double number = Double.parseDouble(x);
            dataList.add(number);
        }
        calculator.putData(dataList);
        try {
            assertTrue(calculator.mean()== 60.32 && calculator.standarDeviation() == 62.26);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    /**
     * Statistical calculation failure
     * Test failure when calculator's data is null.
     */
    public static void statisticalCalculationFailure(){
        calculator.eraseData();
        try{
            calculator.mean();
        } catch (Exception e){
            assertEquals(e.getMessage(), CalculatorException.NULL_DATA);
        }
    }
}