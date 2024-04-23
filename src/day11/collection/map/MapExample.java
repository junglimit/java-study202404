package day11.collection.map;

import day09.poly.car.Mustang;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        // 객체를 여러개 생성하는것이 아닌 하나만 생성할땐 Map 을 사용해서 만드는게 더 빠르고 간편함.
        // 한번에 만들기 때문에, 키와 밸류를 작성함
        Map<String, Object> map = new HashMap<>();

        // 데이터 추가: put()
        map.put("지갑잔액",500);
        map.put("좋아하는 자동차",new Mustang());
        map.put("오늘 저녁 메뉴","계란볶음밥");

        // 키 값만 적용됨
        System.out.println(map.size()); // 3

        // get(key)
        int money = (int) map.get("지갑잔액");
        System.out.println("money = " + money);

        // 중복된 키를 저장하면 값이 수정된다.
        map.put("지갑잔액", 99999);
        System.out.println(map);

        // map 의 반복문 처리
        for (String s : map.keySet()) {
            System.out.println("s = " + s);
            System.out.println("value = " + map.get(s));
        }

    }
}
