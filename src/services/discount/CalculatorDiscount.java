package services.discount;

import java.math.BigDecimal;

public class CalculatorDiscount implements CalculateDiscount {
    @Override
    public BigDecimal doCalculate(BigDecimal total, double percentageDiscount) {
        return BigDecimal.valueOf(total.doubleValue() * (percentageDiscount / 100));
    }
}
