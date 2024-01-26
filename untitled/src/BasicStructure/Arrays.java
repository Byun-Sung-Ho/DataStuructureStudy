package BasicStructure;

public class Arrays {
    public void IntArray(int[] numbers) {
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("numbers' sum is "+sum);
    }

    public void ReverseArray(int[] numbers) {
        for (int i = 0; i < numbers.length/2; i++) {
            swap(numbers,i,numbers.length-i-1);
        }
        System.out.print("{");
        for (int i = 0; i < numbers.length-1; i++) {
            System.out.print(numbers[i]+",");
        }
        System.out.print(numbers[numbers.length-1]+"}");
    }

    public void swap(int[] numbers, int idx1, int idx2) {
        int temp = numbers[idx1];
        numbers[idx1] = numbers[idx2];
        numbers[idx2] = temp;
    }

    public boolean ArrayEqualCheck(int[] a, int[] b){
        if (a.length != b.length) {
            System.out.println("Arrays are not same");
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                System.out.println("Arrays are not same");
                return false;
            }
        }
        System.out.println("Arrays are same");
        return true;
    }
}
