package services.shipping;

import java.math.BigDecimal;

public class CalculatorShipping implements CalculateShipping {
    @Override
    public BigDecimal doCalculate(BigDecimal total) {
        if (total.doubleValue() < 100) {
           return new ExpensiveShipping().getShippingCost();
        } else if (total.doubleValue() >= 100 && total.doubleValue() <= 200) {
            return new CheapShipping().getShippingCost();
        } else {
            return new FreeShipping().getShippingCost();
        }
    }
}
