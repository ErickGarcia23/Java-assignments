import java.util.Random;

public class  problem2{

    public static void main(String[] args) {

        Random random = new Random();
        int array[]=new int[20];
        System.out.println("Random Values: ");
        for (int i=0; i < array.length ; i++) {
            array[i] = random.nextInt(99);
            System.out.println(array[i]);            
        }    

    }
}
