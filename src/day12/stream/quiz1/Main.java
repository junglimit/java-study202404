package day12.stream.quiz1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class Main {

        public static void main(String[] args) {

            Trader raoul = new Trader("Raoul", "Cambridge");
            Trader mario = new Trader("Mario", "Milan");
            Trader alan = new Trader("Alan", "Cambridge");
            Trader brian = new Trader("Brian", "Cambridge");

            List<Transaction> transactions = List.of(
                    new Transaction(brian, 2021, 300),
                    new Transaction(raoul, 2022, 1000),
                    new Transaction(raoul, 2021, 400),
                    new Transaction(mario, 2021, 710),
                    new Transaction(mario, 2022, 700),
                    new Transaction(alan, 2022, 950)
            );

            // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
            // List<Transaction>
            List<Transaction> collect = transactions.stream()
                    .filter(t -> t.getYear() == 2021)
                    .sorted(comparing(Transaction::getValue))
                    .collect(toList());
            collect.forEach(System.out::println);


            // 연습 2: 거래자가 근무하는 모든 도시이름을 중복 없이 나열하시오.
            // List<String>
            System.out.println("===========================");
            List<String> collect1 = transactions.stream()
                    .map(t -> t.getTrader().getCity())
                    .distinct()
                    .collect(toList());

            System.out.println(collect1);


            // 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 거래자리스트로 이름순으로 오름차정렬.
            // List<Trader>
            System.out.println("==========================");
            List<Trader> collect2 = transactions.stream()
                    .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                    .map(Transaction::getTrader)
                    .distinct()
                    .sorted(comparing(Trader::getName))
                    .collect(toList());

            collect2.forEach(System.out::println);

            // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로  오름차정렬하여 반환
            // List<String>
            System.out.println("==========================");
            List<String> collect3 = transactions.stream()
                    .map(t -> t.getTrader().getName())
                    .distinct()
                    .sorted()
                    .collect(toList());

            collect3.forEach(System.out::println);



            // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
            System.out.println("==========================");
            boolean flag = transactions.stream()
                    .anyMatch(t -> t.getTrader().getCity().equalsIgnoreCase("Milan"));
            System.out.println(flag);

            // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.
            System.out.println("==========================");
            int sum = transactions.stream()
                    .filter(t -> t.getTrader().getCity().equalsIgnoreCase("Cambridge"))
                    .mapToInt(Transaction::getValue)
                    .sum();
            System.out.println("sum = " + sum);

            // 연습 7: 모든 거래에서 최고거래액은 얼마인가?
            System.out.println("==========================");
            int max = transactions.stream()
                    .mapToInt(Transaction::getValue).max().getAsInt();

            System.out.println("max = " + max);


            // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색
            System.out.println("==========================");

            Optional<Transaction> min = Optional.of(transactions.stream()
                    .min(comparing(Transaction::getValue))
                    .orElse(null)); // null 검사 ( if/else ) 대신 해주는 메서드. Optional 에서 사용가능



            System.out.println("min = " + min);

            // 연습 9. 거래액이 500 이상인 거래들만 필터링하고, 해당 거래의 정보를 출력하시오.
            System.out.println("==========================");
            transactions.stream()
                    .filter(t->t.getValue() >= 500)
                    .forEach(System.out::println);


            // 연습 10. 모든 거래에서 가장 작은 거래액보다 큰 거래액을 가진 거래의 평균을 계산하시오.
            // 출력값: 752.0
            System.out.println("==========================");
            double asDouble = transactions.stream()
                    .mapToInt(t -> t.getValue())
                    .skip(1)
                    .average()
                    .getAsDouble();
            System.out.println("asDouble = " + asDouble);


            // 연습 11. "Cambridge"에서 거래하는 모든 거래자의 거래액을 연도별로 그룹화하여 출력하시오.
        /*
               출력예시

                Year: 2021
                {Trader: Brian in Cambridge, year: 2021, value: 300}
                {Trader: Raoul in Cambridge, year: 2021, value: 400}

                Year: 2022
                {Trader: Raoul in Cambridge, year: 2022, value: 1000}
                {Trader: Alan in Cambridge, year: 2022, value: 950}
         */
//            System.out.println("==========================");
//            List<Transaction> collect4 = transactions.stream()
//                    .filter(t -> t.getYear() == 2021)
//                    .sorted(comparing(Transaction::getYear))
//                    .collect(toList());
//
//            List<Transaction> collect5 = transactions.stream()
//                    .filter(t -> t.getYear() == 2022)
//                    .sorted(comparing(Transaction::getYear))
//
//                    .collect(toList());
//            Map<String, Object> map = new HashMap<>();
//            map.put("\nyear: 2021\n", collect4);
//
//            map.put("\nyear: 2022\n", collect5);
//            System.out.println(map);

            /*
            Map<Integer, List<Transaction>> groupByYearMap = new HashMap<>();

            List<Transaction> trs2021 = transactions.stream()
                    .filter(trs -> trs.getYear() == 2021)
                    .collect(toList());

            List<Transaction> trs2022 = transactions.stream()
                    .filter(trs -> trs.getYear() == 2022)
                    .collect(toList());

            groupByYearMap.put(2021, trs2021);
            groupByYearMap.put(2022, trs2022);


            System.out.println("=====================");
            for (Integer year : groupByYearMap.keySet()) {
                System.out.println("year = " + year);
                for (Transaction transaction : groupByYearMap.get(year)) {
                    System.out.println(transaction);
                }
            }
        */


            Map<Integer, List<Transaction>> cambridgeTrsMap = transactions.stream()
                    .filter(trs -> trs.getTrader().getCity().equalsIgnoreCase("Cambridge"))
                    .collect(groupingBy(trs -> trs.getYear()));

            cambridgeTrsMap.forEach((key,value) -> {
                System.out.println("year = " + key);
                value.forEach(System.out::println);
            });



            // 연습 12. 모든 거래 중 가장 큰 거래액과 가장 작은 거래액의 차이를 계산하시오.
            // 출력 값 : 700
            System.out.println("==========================");
            int max1 = transactions.stream()
                    .mapToInt(t -> t.getValue()).max().getAsInt();
            int min1 = transactions.stream()
                    .mapToInt(t -> t.getValue()).min().getAsInt();

            System.out.println(max1 - min1);


        }


    }

