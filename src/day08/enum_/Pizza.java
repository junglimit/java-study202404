package day08.enum_;

import static day08.enum_.PizzaStatus.*;

public class Pizza {

    private String pizzaName;
    private PizzaStatus status; // 주문완료, 요리완료, 배달완료


    // 피자 주문 기능
    public void orderPizza() {
        this.status = ORDERED;
        System.out.println("피자 주문이 들어왔습니다.");
    }

    // 피자 준비 완료 기능
    public void readyPizza() {
        if (this.status == ORDERED) {
            this.status = READY;
            System.out.println("피자가 준비되었습니다.");
        } else {
            System.out.println("피자 주문이 없습니다.");
        }
    }

    public PizzaStatus getStatus() {
        return status;
    }

    // 피자 배달 기능
    public void deliverPizza() {
        if(this.status == READY) {
            this.status = DELIVERED;
            System.out.println("피자가 배달되었습니다.");
        } else {
            System.out.println("피자가 아직 요리중입니다.");
        }
    }
}
