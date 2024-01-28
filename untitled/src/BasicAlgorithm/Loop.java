package BasicAlgorithm;

import java.util.Scanner;

public class Loop {
    public void sumOneToN() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type the number");
        int num1 = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= num1; i++) {
            sum += i;
        }
        System.out.println("sum is "+sum);
    }

    public void multiTable() {
        System.out.println("--------------table-------------");

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }

    public void makeTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type the number");
        int num1 = scanner.nextInt();

        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void makePyramid() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type the number");
        int num1 = scanner.nextInt();
        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j<=num1 - i;j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void checkPrimeNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("type the number");
        int num = scanner.nextInt();

        int counter = 0;

        for (int i = 2; i < num; i++) {
            if (num%i==0){
                System.out.println("It's not Prime Number");
                break;
            }
        }

        System.out.println("It's Prime Number");
    }
}
