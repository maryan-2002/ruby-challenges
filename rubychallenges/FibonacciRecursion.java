import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the Fibonacci sequence: ");
        int input = scanner.nextInt();
        for (int i=0;i<input;i++){
            System.out.println(fibonacci(i)+" ");
        }
        scanner.close();
    }

    private static int fibonacci(int count) {
        if (count<=1)
            return count;
        return fibonacci(count-1)+fibonacci(count-2);
    }
    
}