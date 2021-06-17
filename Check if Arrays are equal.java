import java.util.*;
class problem3 {
  
    public static boolean areEqual(int array1[], int array2[])
    {
        int a = array1.length;
        int b = array2.length;
 
        if (a != b)
            return false;
 
        Arrays.sort(array1);
        Arrays.sort(array2);
 
        for (int i = 0; i < a; i++)
            if (array1[i] != array2[i])
                return false;
 
        return true;
    }
    public static void main(String[] args)
    {
        int [] array1 = {1, 3, 5, };
        int [] array2 = {1, 3, 5, };
 
        if (areEqual(array1, array2))
        {
            System.out.println("Arrays are equal");
        	System.out.println(Arrays.toString(array1));
        	System.out.println(Arrays.toString(array2));
        }	
        else 
        {
        	System.out.println("Arrays are not equal");
        	System.out.println(Arrays.toString(array1));
        	System.out.println(Arrays.toString(array2));
        }
        		
    }
}