import java.util.Arrays;

public class problem1 {

    public static void main(String[] args) {
    	
        int[] array = {2, 3, 4, 1, 6, 7};
        System.out.println(Arrays.toString(array));
        reverse(array); 
        
        System.out.println("Reversed String");
        System.out.println(Arrays.toString(array));
    }

    public static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
    }
}