import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,4,6,8,4,2,353,64,6,7,74,34};
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            System.out.println("temp---->"+temp);
            int j;
            for (j = i -1; j >= 0 && arr[j] > temp ; j--) {
                arr[j+1] = arr[j];
                System.out.println("arr[j+1]---->"+arr[j+1]);
            }
            arr[j+1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
