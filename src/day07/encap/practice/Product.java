package day07.encap.practice;

// 제품의 이름(name), 가격(price), 재고 수량(stock)을 관리하는 `Product` 클래스를 만드세요.
public class Product {
    private String name;
    private int price;
    private int stock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void reduceStock(int reduce) {
        if(reduce > stock || reduce < 0) {
            System.out.println("요청한 수량이 재고보다 많거나 잘못된 수량입니다.");
           return;
        } else {
            stock -= reduce;
        }
    }
}
