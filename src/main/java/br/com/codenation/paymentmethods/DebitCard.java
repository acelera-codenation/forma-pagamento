package br.com.codenation.paymentmethods;

public class DebitCard implements PriceStrategy {

    public static final double DISCOUNT = 0.95;

    @Override
    public Double calculate(Double price) {
        return price * DISCOUNT;
    }
}
