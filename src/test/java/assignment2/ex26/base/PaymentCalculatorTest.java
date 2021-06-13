package assignment2.ex26.base;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PaymentCalculatorTest {

   @Test
    void TestingDefaultCase() {
        double actual = PaymentCalculator.calculateMonthsUntilPaidOff(5000, 12, 100, 0) ;
        double expected = 70.0;
       Assertions.assertEquals(expected, actual);
    }
}