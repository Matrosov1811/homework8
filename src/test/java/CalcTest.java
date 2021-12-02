import org.junit.Assert;
import org.junit.Test;
import pav.matrosov.Functions;

public class CalcTest {

    @Test
    public void checkSumFunctionTest() {
        Functions calc = new Functions();
        Assert.assertTrue((calc.sum(4, 4 )) == 8);
    }

    @Test
    public void checkSubstrFunctionTest() {
        Functions calc = new Functions();
        Assert.assertTrue((calc.subtraction(4, 4 )) == 0);
    }

    @Test
    public void checkMultipleFunctionTest() {
        Functions calc = new Functions();
        Assert.assertTrue((calc.multiplication(4, 4 )) == 16);
    }

    @Test
    public void checkDivFunctionTest() throws Exception {
        Functions calc = new Functions();
        Assert.assertTrue((calc.div(4, 4 )) == 1);
    }

    @Test
    public void checkThrowingExceptionForDivWithZero() throws Exception {
        Functions calc = new Functions();
        boolean b = false;
        try {
            calc.div(0,0);
        } catch (Functions.DivWithZero divWithZero) {
            b = true;
        }
        Assert.assertTrue(b);
    }

    @Test
    public void checkThrowingExceptionIncorrectOperator() throws Exception {
        Functions calc = new Functions();
        boolean b = false;
        try {
            calc.setOperation("0");
        } catch (Functions.IncorrectOperator incorrectOperator) {
            b = true;
        }
        Assert.assertTrue(b);
    }

}
