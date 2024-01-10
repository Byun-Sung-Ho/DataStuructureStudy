package BasicAlgorithm;

import java.util.Scanner;

public class MaxThree {
    public void max3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("type the three numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int maxNum = num1;
        if (maxNum < num2) {
            maxNum = num2;
        }
        if (maxNum < num3) {
            maxNum = num3;
        }

        System.out.println("Max number is : " + maxNum);
    }
}
