package com.enigma.lambdaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambda {
    public static void main(String[] args) {

//        Lamda = Anonymous Function/Arrow Function
        //        Greeting hello = (String name) -> {
        //            System.out.println("Hello " +name);
        //        };
        //
        //        hello.sayHello("Aditya");
        //    }

//        Greeting hello = (name) -> System.out.println("Hallooo " + name);
//        hello.sayHello("Aditya");
//
//        Consumer<String> greeting = (name) -> System.out.println("Hellloo " + name);
//        greeting.accept("Asep");
//
        List<Integer> nums = new ArrayList<>(List.of(3,4,5,6));
//
//        Consumer<Integer> kali = (num) -> {
//            int result = num*2;
//            System.out.println(result);
//        };

//        ForEach
//        nums.forEach(kali);
//
//        System.out.println("=========");
//        nums.forEach((num) -> {
//            int result = num^2;
//            System.out.println(result);
//        });
//
//        System.out.println("=========");
//        nums.forEach(num -> System.out.println(num*2));


//        Map
//        Function<Integer, Integer> newKali2 = num1 -> {
//            return num1 * 2;
        };

//        List<Integer> dikali2 = nums.stream().map(newKali2).toList();
//
//        System.out.println("List awal : " + nums);
//        System.out.println("List setelah map : " + dikali2);
//        dikali2.forEach(System.out::println);


//        Filter
//        Predicate
        Predicate<String> isContains = (word) -> {
          return word.contains("a");
        };
        System.out.println(isContains.test("Aditya"));


        List<Integer> evenNumber = nums.stream()
                .filter((nmbr) ->{
                    return nmbr  % 2 ==0;
                })
                .toList();

        System.out.println("List awal : " + nums);
        System.out.println("List setelah map : " + evenNumber);
    }
}
