package day07.inherit.practice;

public class ElectronicProduct {

    String productName;
    int price;
    String manufacturer;


//    public ElectronicProduct(String productName, int price, String manufacturer) {
//        this.productName = productName;
//        this.price = price;
//        this.manufacturer = manufacturer;
//    }
    public void displayInfo() {
        System.out.println(productName + " price: " + price + " 제조사: " + manufacturer);
    }
}
