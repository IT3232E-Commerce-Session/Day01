// 8) implement classes for the given scenario:
// 	- A reatail store which can store,edit,and delete 
// multible products like fruits, vegetables, grocery, etc..
// 	- display the avilabe products like price, name, 
// 	quantity

import java.util.*;

class Product {
    String name;
    double price;
    int qty;

    public Product(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public void displayProduct() {
        System.out.println("Name: " + name + ", Price: " + price + ", Quantity: " + qty);
    }
}

public class Q08 {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Apple", 250, 50));
        products.add(new Product("Potato", 100, 100));
        products.add(new Product("Carrot", 400, 80));

        System.out.println("Available products in the store:");
        for (Product product : products) {
            product.displayProduct();
        }

        products.get(0).price = 120;  
        products.get(1).qty = 17;  

        System.out.println("\nUpdated products:");
        for (Product product : products) {
            product.displayProduct();
        }
    }
}

//output
// @T-Lanojika ➜ /workspaces/Day01 (main) $ javac Q08.java
// @T-Lanojika ➜ /workspaces/Day01 (main) $ java Q08
// Available products in the store:
// Name: Apple, Price: 250.0, Quantity: 50
// Name: Potato, Price: 100.0, Quantity: 100
// Name: Carrot, Price: 400.0, Quantity: 80

// Updated products:
// Name: Apple, Price: 120.0, Quantity: 50
// Name: Potato, Price: 100.0, Quantity: 17
// Name: Carrot, Price: 400.0, Quantity: 80