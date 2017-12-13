package samples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 */
public class PrintNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

  /*      for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        newLine();
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        newLine();*/

  numbers.forEach(new Consumer<Integer>() {
      @Override
      public void accept(Integer number) {
          System.out.print(number + " ");
      }
  });


        numbers.forEach(
                (Integer number) ->  {
                    System.out.print(number + " ");
                }
        );

        numbers.forEach((Integer number) -> System.out.print(number + " ")
        );

        numbers.forEach(number -> System.out.print(number + " ")
        );

        numbers.forEach(System.out::println);

    }

    private static void newLine() {
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

}
