package entities;

import java.math.BigDecimal;

public class Order {
    private long id;
    private BigDecimal total;
    private double percentDiscount;

    public Order(long id, BigDecimal total, double percentDiscount) {
        this.id = id;
        this.total = total;
        this.percentDiscount = percentDiscount;
    }

    public double getPercentDiscount() {
        return percentDiscount;
    }

    public void setPercentDiscount(double percentDiscount) {
        this.percentDiscount = percentDiscount;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
