package DataAlgo.FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HigherOrderFunctions {

    // forEach Loop using lamda expression
    public static void forEachLoop(List<String> listOfStrings) {
        listOfStrings.forEach(str -> {
            System.out.println(str);
        });
    }

    // Sort using comparators
    public static void sortNumbers(List<Integer> numbers) {
        numbers.sort((right, left)-> {
            return right.compareTo(left);
        });
    }

    // forEach Loop using BiConsumer
    public static void forEachLoopMap(Map<String, Integer> ratings) {
        ratings.forEach((key, value)-> {
            System.out.println("Coffee " + key + " Rating " + value);
        });
    }

    // Stream Operations - using filter, map, sorted (ascending)
    public static void filterPrices(List<Double> prices) {
        prices.stream()
                .filter(price-> {
                    return price > 50;
                })
                .map(price -> {
                    return price - 10;
                })
                .sorted((right, left)-> {
                    return right.compareTo(left);
                })
                .map(price -> {
                    return "$" + price;
                })
                // forEach is a terminal operation
                .forEach(price -> {
                    System.out.println(price);
                });
    }


}
