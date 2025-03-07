package services.shipping;

import java.math.BigDecimal;

public class ExpensiveShipping implements ShippingPrice{
    @Override
    public BigDecimal getShippingCost() {
        return new BigDecimal("20.00");
    }
}
