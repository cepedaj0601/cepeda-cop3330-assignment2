package assignment2.ex26.base;

import static java.lang.Math.log;
import static java.lang.Math.pow;

public class PaymentCalculator {
    public static int calculateMonthsUntilPaidOff (double balance, double apr, double payment, int time){
        double power = Math.pow(2, 30);
        time = (int) (-(1/30) * log(1 + balance/payment * (1 - (1 + ((apr/365)* power ))) / log(1 + (apr/365))));
        return time;
    }
}
