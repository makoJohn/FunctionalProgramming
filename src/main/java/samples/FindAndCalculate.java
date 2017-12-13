package samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 */
public class FindAndCalculate {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

/*        int sum1 = calcSum(numbers);

        List<Integer> numbers2 = Arrays.asList(1, 2, 6, 7, 8);
        System.out.println(calcSum(numbers2));*/
  /*      int evenSum = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenSum += number;
            }
        }*/
/*        System.out.println(calcSum(numbers, new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n % 2 ==0;
            }
        }));
        System.out.println(calcSum(numbers, n -> n % 2 ==0));*/

        numbers.stream()
                .filter(e -> e < 4)
                .forEach(e -> System.out.println(e));

        List<Integer> doubledEvenNumbersList = new ArrayList<>();
        for (Integer integer : numbers) {
            if (isEven(integer)) {
                doubledEvenNumbersList.add(integer * 2);
            }
        }
        System.out.println(doubledEvenNumbersList);

        System.out.println(
                numbers.stream()
                .filter(e -> isEven(e))
                .map(e -> e * 2)
                .collect(Collectors.toList())
        );
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(numbers);
/*        Integer result = null;
        for (Integer number : numbers) {
            if (isGT3(number) && isEven(number)) {
                result = number;
                break;
            }
        }*/

        numbers.stream().filter(n -> isGT3(n)).filter(FindAndCalculate::isEven)

                .map(e -> e)
        .findFirst();

        // numbers {-> filter -> filter - map }- ACTION



    }

    private static boolean isGT3(Integer n) {
        System.out.println("isGT3 " + n);
        return n >= 3;
    }

    private static boolean isEven(Integer e) {
        System.out.println("is even " + e);
        return e % 2 ==0;
    }

    private static int calcSum(List<Integer> numbers, Predicate<Integer> condition) {
        int sum = 0;
        for (Integer number : numbers) {
            if (condition.test(number)) {
                sum += number;
            }
        }

        System.out.println(sum);
        return sum;
    }

    private static int calcSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        System.out.println(sum);
        return sum;
    }

    private static int calcEvenSum(List<Integer> numbers) {
        int evenSum = 0;
        for (Integer number : numbers) {
            if (isEven(number)) {
                evenSum += number;
            }
        }
        return evenSum;
    }


}
