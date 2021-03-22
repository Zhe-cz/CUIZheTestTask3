package cm;

import java.math.BigDecimal;

public class StudentRate implements ReductionRates {
    @Override
    public BigDecimal reduction(BigDecimal cost) {
        BigDecimal studentNotReduced = new BigDecimal("5.50");
        BigDecimal studentReduction = new BigDecimal("0.25");
        if (cost.compareTo(studentNotReduced) <= 0) return cost;
        else return ((cost.subtract(studentNotReduced).multiply(studentReduction).add(studentNotReduced)));
    }
}
