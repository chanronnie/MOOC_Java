/*
============== Java Programming I ==============
Part 4
Section 1 - Introduction to object-oriented programming
Ex 7 - Product


Create a class Product that represents a store product. 
The product should have a price (double), a quantity (int) and a name (String).

The class should have:
the constructor public Product (String initialName, double initialPrice, int initialQuantity)
a method public void printProduct() that prints product information in the following format:
=================================================
*/

public class Main {

    public static void main(String[] args) {
        // This is an empty main method for testing the Product class
        // Try:

        Product product = new Product("Banana", 1.1, 13);
        product.printProduct();
    }
}
