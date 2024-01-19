import BasicAlgorithm.Comparing;
import BasicAlgorithm.Loop;
import BasicStructure.Arrays;

public class Main {
    public static void main(String[] args) {

        Comparing comparing = new Comparing();
        Loop loop = new Loop();
        Arrays arrays = new Arrays();
//        comparing.max3();
//        comparing.med3();
//        comparing.judgeSign();
//        loop.sumOneToN();
//        loop.multiTable();
//        loop.makeTriangle();
//        loop.makePyramid();
        int[] numbers = {1, 2, 3, 4};
//        arrays.IntArray(numbers);
        arrays.ReverseArray(numbers);
    }
}