package BasicAlgorithm;

import java.util.Scanner;

public class Comparing {
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

    public void med3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("type the three numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int res = 0;
        if (num1 > num2) {
            if (num2 > num3) {
                System.out.println("median number is : " + num2);
            }
            else if (num1<num3){
                System.out.println("median number is : " + num1);
            }
            else {
                System.out.println("median number is : " + num3);
            }
        }

        else if (num1>num3){
            System.out.println("median number is : " + num1);
        } else{
            System.out.println("median number is : " + num2);
        }
    }

    public void judgeSign(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("type the number");
        int num1 = scanner.nextInt();

        if (num1 > 0) {
            System.out.println("number is +");
        } else if (num1 < 0) {
            System.out.println("number is -");
        }else {
            System.out.println("number is 0");
        }
    }


}
