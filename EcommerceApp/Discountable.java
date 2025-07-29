package ecommerce.model;

@FunctionalInterface
public interface Discountable {
double applyDiscount(double price);
}