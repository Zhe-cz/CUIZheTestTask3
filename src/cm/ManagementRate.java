package cm;

import java.math.BigDecimal;

public class ManagementRate implements ReductionRates {
    @Override
    public BigDecimal reduction(BigDecimal cost) {
        BigDecimal ManagmentMinimumPay = new BigDecimal("3");
        if (cost.compareTo(ManagmentMinimumPay) == -1)  return ManagmentMinimumPay;
        else return cost;
    }
}
