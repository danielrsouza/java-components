package services.shipping;

import java.math.BigDecimal;

public class FreeShipping implements ShippingPrice{
    @Override
    public BigDecimal getShippingCost() {
        return new BigDecimal("00.00");
    }
}
