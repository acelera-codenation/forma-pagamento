package br.com.codenation.paymentmethods;

public class Cash implements PriceStrategy {

    public static final double DISCOUNT = 0.9;

    @Override
    public Double calculate(Double price) {
        return price * DISCOUNT;
    }
}
