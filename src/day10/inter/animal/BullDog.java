package day10.inter.animal;

// 상속과는 다르게 여러개 구현이 가능함
public class BullDog implements Pet, Aggressive {

    @Override
    public void handle() {

    }

    @Override
    public boolean inject() {
        return false;
    }

    @Override
    public void hunt(Pet pet) {

    }

    @Override
    public void violent() {

    }

    // 사냥 기능

    // 난폭함

    // 애완동물로 키울 수 있음

}
