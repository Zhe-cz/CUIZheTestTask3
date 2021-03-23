package cm;

import java.math.BigDecimal;

public class VisitorRate implements ReductionRates {
    @Override
    public BigDecimal reduction(BigDecimal cost) {
        BigDecimal visitorFree = new BigDecimal("8");
        BigDecimal visitorReduced = new BigDecimal("0.50");
        if (cost.compareTo(visitorFree) == -1) return BigDecimal.ZERO;
        else return ((cost.subtract(visitorFree)).multiply(visitorReduced));
    }
}
