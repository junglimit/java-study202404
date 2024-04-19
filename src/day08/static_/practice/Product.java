package day08.static_.practice;

public class Product {

    private String productName;
    private int Price;

    public Product(String productName, int price) {
        this.productName = productName;
        this.Price = price;
    }

    public void sellProduct() {

        Store.addSale(this.Price);
    }
}
