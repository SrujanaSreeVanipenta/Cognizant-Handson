package com.ecommerce.search;

public class SearchTest {

    public static void main(String[] args) {

        // Product Array
        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Tablet", "Electronics")
        };

        // LINEAR SEARCH
        System.out.println("----- Linear Search -----");

        Product result1 =
                SearchOperations.linearSearch(products, "Shoes");

        if (result1 != null) {
            System.out.println("Product Found");
            result1.display();
        } else {
            System.out.println("Product Not Found");
        }

        // BINARY SEARCH
        System.out.println("\n----- Binary Search -----");

        Product result2 =
                SearchOperations.binarySearch(products, 104);

        if (result2 != null) {
            System.out.println("Product Found");
            result2.display();
        } else {
            System.out.println("Product Not Found");
        }
    }
}