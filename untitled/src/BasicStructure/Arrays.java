package BasicStructure;

public class Arrays {
    public void IntArray(int[] numbers) {
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("numbers' sum is "+sum);
    }
}
