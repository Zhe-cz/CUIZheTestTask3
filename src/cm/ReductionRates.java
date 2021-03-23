package cm;

import java.math.BigDecimal;

public interface ReductionRates {
    BigDecimal reduction(BigDecimal cost);
}
