package day12.lambda;

import java.util.ArrayList;
import java.util.List;

// 사과를 여러가지 방법으로 필터링하는 클래스
public class FilterApple {

    /**
     * @solution - try1 - 사과바구니 안에서 색상이 녹색인 사과들만 필터링 하기
     * @param basket - 다양한 사과가 들어있는 리스트
     * @return - basket 에서 녹색사과만 필터링한 리스트
     * @problem - 만약 다른 색의 새과를 필터링 해야 한다면 이 메서드는 한계가 있음
     */
    public static List<Apple> filterGreenApples(List<Apple> basket) {

        // 녹색사과만 담을 바구니 생성
        List<Apple> greenApples = new ArrayList<>();
        // 반복문과 조건문을 통해 필터링
        for (Apple apple : basket) {
            if(apple.getColor() == Color.GREEN) {
                greenApples.add(apple);
            }
        }

        return greenApples;
    }

    /**
     * @solution - try2 : 색상을 파라미터화 하여 원하는 컬러의 사과를 필터링한다
     * @param basket
     * @param color - 원하는 필터링 색상
     * @return
     * @problem - 필터기준이 색상이 아니라 무게 기준이면 필터링 못함
     */
    public static List<Apple> filterApplesByColor(List<Apple> basket, Color color) {

        // 필터링한 사과만 담을 바구니 생성
        List<Apple> filteredApples = new ArrayList<>();
        // 반복문과 조건문을 통해 필터링
        for (Apple apple : basket) {
            if(apple.getColor() == color) {
                filteredApples.add(apple);
            }
        }

        return filteredApples;
    }

}
