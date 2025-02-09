import java.util.Arrays;

public class Main {

    public static void Sortirovka(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] % 2 == 0 && arr[j + 1] % 2 == 0) {
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }}}}}
    public static void main(String[] args) {
        int[] numbers = {4, 1, 6, 3, 8, 5, 2, 10, 7};
        Sortirovka(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}

