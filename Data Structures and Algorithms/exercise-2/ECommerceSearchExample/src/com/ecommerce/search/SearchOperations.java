package com.ecommerce.search;

public class SearchOperations {

    // Linear Search by Product Name
    public static Product linearSearch(Product[] products, String productName) {

        for (Product product : products) {

            if (product.productName.equalsIgnoreCase(productName)) {
                return product;
            }
        }

        return null;
    }

    // Binary Search by Product ID
    public static Product binarySearch(Product[] products, int productId) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (products[mid].productId == productId) {
                return products[mid];
            }

            else if (products[mid].productId < productId) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        return null;
    }
}