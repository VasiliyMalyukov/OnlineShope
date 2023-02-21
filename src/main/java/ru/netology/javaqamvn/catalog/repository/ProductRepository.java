package ru.netology.javaqamvn.catalog.repository;

import ru.netology.javaqamvn.catalog.domain.Product;

public class ProductRepository {
    private Product[] products = new Product[0];

    public void save(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    public void removeProductId(int id) {
        Product[] tmp = new Product[products.length - 1];
        int copyToIndex = 0;
        for (Product product : products) {
            if (product.getID() != id) {
                tmp[copyToIndex] = product;
                copyToIndex++;
            }
        }
        products = tmp;
    }

    public Product[] getProduct() {
        return products;
    }
}
