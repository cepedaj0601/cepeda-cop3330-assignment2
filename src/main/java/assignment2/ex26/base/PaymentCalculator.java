package assignment2.ex26.base;

import static java.lang.Math.*;

public class PaymentCalculator {
    public static double calculateMonthsUntilPaidOff (double balance, double apr, double payment, double time){
        double power = Math.pow((1 + (apr/365)), 30);

        time = (-(1.0/30.0) * log(1 + Math.ceil(balance/payment) * (1 - power ))) / log(1 + (apr/365));
        return time;
    }
}
