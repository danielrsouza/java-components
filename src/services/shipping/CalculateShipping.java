package services.shipping;

import java.math.BigDecimal;

public interface CalculateShipping {
    BigDecimal doCalculate(BigDecimal total);
}
