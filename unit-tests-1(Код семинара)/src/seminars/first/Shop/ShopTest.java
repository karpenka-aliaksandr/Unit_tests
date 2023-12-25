package seminars.first.Shop;


import java.awt.*;
import java.util.List;

import java.util.ArrayList;

public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */
    public static void main(String[] args) {
        Shop shop = new Shop();
        Product juice = new Product();
        juice.setTitle("Juice");
        juice.setCost(250);
        Product cake = new Product();
        cake.setTitle("Cake");
        cake.setCost(200);
        Product water = new Product();
        water.setTitle("Water");
        water.setCost(100);
        List<Product> products = new ArrayList();
        products.add(juice);
        products.add(cake);
        products.add(water);
        shop.setProducts(products);
        for (Product product: shop.getProducts()) {
            System.out.println(product.getTitle() + " " + product.getCost());
        }
        for (Product product: shop.sortProductsByPrice()) {
            System.out.println(product.getTitle() + " " + product.getCost());
        }
       Product product = shop.getMostExpensiveProduct();
       System.out.println(product.getTitle() + " " + product.getCost());


       // как написать тесты пока совсем не понял.

    }
}