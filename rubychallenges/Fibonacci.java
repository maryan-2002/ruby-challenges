import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the Fibonacci sequence: ");
        int input = scanner.nextInt();

        if (input<=0){
            System.out.println("Input should be positive number: ");
        }else{
            fibonacci(input);
        }
        scanner.close();
    }
    public static void fibonacci(int n){
        if (n==1){
            System.out.println("the next number is: 0");
        }else if(n==2){
            System.out.println("the next number is: 1");
        }else{
            int a=0,b=1;
            for (int i=2;i<n;i++){
                int temp =a+b;
                a=b;
                b=temp;
            }
            System.out.println("the next number is: " + b);
        }
    }
}