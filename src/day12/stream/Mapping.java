package day12.stream;

import java.util.List;
import java.util.stream.Collectors;

import static day12.stream.Menu.*;

public class Mapping {

    public static void main(String[] args) {

        // 요리 이름만 추출
        List<String> nameList = menuList
                .stream()
                .map(dish -> dish.getName())
                .collect(Collectors.toList());
        System.out.println(nameList);

        System.out.println("=========================");

        List<String> words = List.of(
                "safari", "chrome", "ms edge"
                , "opera", "firefox"
        );
        List<Integer> collected = words.stream()
                .map(w -> w.length())
                .collect(Collectors.toList());
        System.out.println(collected);

        List<Character> characterList = words.stream()
                .map(w -> w.charAt(0)) // 문자열에서 해당 위치 글자 추출
                .collect(Collectors.toList());
        System.out.println(characterList);


        System.out.println("=========================");

        // 메뉴 목록에서 메뉴이름과 칼로리를 추출해서
        // 새로운 객체로 뽑아내기

//        List<String> nameCaloriesList = menuList.stream()
//                .map(dish -> dish.getName() + dish.getCalories())
//                .collect(Collectors.toList());
//
//        System.out.println(nameCaloriesList);

        List<SimpleDish> simpleDishList = menuList

                .stream()
                .map(dish -> new SimpleDish(dish))
                .collect(Collectors.toList());

        simpleDishList.forEach(sd -> System.out.println(sd));


    }
}
