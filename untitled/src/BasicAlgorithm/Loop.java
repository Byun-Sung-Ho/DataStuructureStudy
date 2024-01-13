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
}
