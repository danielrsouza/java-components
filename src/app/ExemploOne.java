package app;

import entities.Order;
import services.CalculatorTotal;
import services.discount.CalculateDiscount;
import services.discount.CalculatorDiscount;
import services.shipping.CalculateShipping;
import services.shipping.CalculatorShipping;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExemploOne {
    public static void main(String[] args) {
        // Exemplo 1
        Scanner scanner = new Scanner(System.in);
        // Deixei o código assim para contemplar o exercício
        System.out.println("Digite o código do pedido: ");
        long codOrder = scanner.nextLong();
        System.out.println("Digite total do pedido: ");
        double totalOrder = scanner.nextDouble();
        System.out.println("Digite porcentagem do pedido: ");
        double percentOrder = scanner.nextDouble();

        CalculateDiscount calculatorDiscount = new CalculatorDiscount();
        CalculateShipping calculateShipping = new CalculatorShipping();
        Order order1 = new Order(codOrder, BigDecimal.valueOf(totalOrder), percentOrder);
        CalculatorTotal calculatorTotal = new CalculatorTotal(order1, calculatorDiscount, calculateShipping);

        System.out.println(new StringBuilder().append("Pedido do código: ").append(codOrder));
        System.out.println(new StringBuilder().append("Valor total: R$ ").append(calculatorTotal.calculateTotal()));
    }
}
