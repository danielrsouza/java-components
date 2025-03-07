package services.discount;

import services.shipping.CalculateShipping;

import java.math.BigDecimal;

public interface CalculateDiscount {
    BigDecimal doCalculate(BigDecimal total, double percentageDiscount);
}
