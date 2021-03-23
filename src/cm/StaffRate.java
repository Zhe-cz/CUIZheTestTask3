package cm;

import java.math.BigDecimal;

public class StaffRate implements ReductionRates{

    @Override
    public BigDecimal reduction(BigDecimal cost) {
        BigDecimal stuffMaximumPay = new BigDecimal("16");
        if (cost.compareTo(stuffMaximumPay) >= 0) return  stuffMaximumPay;
        else return cost;
    }
}
