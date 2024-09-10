import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MissingNumbersFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the series of numbers separated by spaces: ");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int[] numbers = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();
        findMissingNumbers(numbers);
        scanner.close();
    }

    public static void findMissingNumbers(int[] numbers) {
        // Find the min and max in the array
        int min = Arrays.stream(numbers).min().orElse(Integer.MIN_VALUE);
        int max = Arrays.stream(numbers).max().orElse(Integer.MAX_VALUE);

        // Create a set of all numbers in the array
        Set<Integer> numberSet = new HashSet<>();
        for (int number : numbers) {
            numberSet.add(number);
        }

        // Check for missing numbers in the range
        System.out.println("Missing numbers:");
        for (int i = min; i <= max; i++) {
            if (!numberSet.contains(i)) {
                System.out.print(i+" ");
            }
        }
    }
}