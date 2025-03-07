package services;

import entities.Order;
import services.discount.CalculateDiscount;
import services.shipping.CalculateShipping;

import java.math.BigDecimal;

public class CalculatorTotal {
    private CalculateShipping calculateShipping;
    private CalculateDiscount calculateDiscount;
    private Order order;

    public CalculatorTotal(Order order, CalculateDiscount calculatorDiscount, CalculateShipping shipping) {
        this.order = order;
        this.calculateDiscount = calculatorDiscount;
        this.calculateShipping = shipping;
    }

    public BigDecimal calculateTotal() {
        BigDecimal discount = calculateDiscount.doCalculate(order.getTotal(), order.getPercentDiscount());
        BigDecimal shipping = calculateShipping.doCalculate(order.getTotal());
        return BigDecimal.valueOf((order.getTotal().doubleValue() - discount.doubleValue()) + shipping.doubleValue());
    }
}
