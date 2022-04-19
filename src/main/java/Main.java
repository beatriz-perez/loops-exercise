import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] output = new int[numbers.length];

        int i = 0;
        int n = numbers.length -1;
        while (i < numbers.length) {
            output[i++] = numbers[n--];
        }

//      for (int i = 0; i < numbers.length; i++){
//            output[numbers.length - 1 - i] = numbers[i];
//       }


        System.out.println("input: " + Arrays.toString(numbers));
        System.out.println("output: " + Arrays.toString(output));


    }
}
