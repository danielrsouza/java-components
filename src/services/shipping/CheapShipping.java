package services.shipping;

import java.math.BigDecimal;

public class CheapShipping implements ShippingPrice{
    @Override
    public BigDecimal getShippingCost() {
        return new BigDecimal("12.00");
    }
}
