package noshameinthegame;

import java.util.Arrays;

public class Main {
    // Question starts
    // create method that creates price of the product
    // Create discount
    // return final price of product after discount

    /*
        1. Need method with 2 para (Price, Discount)
        2. Calculate discounted
        3. - Price multiply by the discount
        4. price minus discount amount
        5. return final price of product.
        6. print return result
         */
    public static double calculateDiscount(double price, double discount){

double calc = (price * discount);
double result = price - calc;
        return result;
    }
    public static void main(String[] args) {

        System.out.println(calculateDiscount(400, .90));
    }}


