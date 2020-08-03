package br.com.codenation.paymentmethods;

public class CreditCard implements PriceStrategy {

    public static final double DISCOUNT = 0.98;

    @Override
    public Double calculate(Double price) {
        return price * DISCOUNT;
    }
}
