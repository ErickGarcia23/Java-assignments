import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;
public class problem1 {
	public static void main(String[] args)
	{
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		int Max = 25;
		for(int i=0; i<(int)(Math.random()*Max) + 2;i++)
			a.add((int)(Math.random()*Max)+2);
			
		for(int i=0; i<(int)(Math.random()*Max) + 2;i++)
			b.add((int)(Math.random()*Max)+2);
		
		ArrayList<Integer> c = merge(a, b);
		System.out.println(a);
		System.out.println(b);
		System.out.println("Merged");
		System.out.println(c);
	}
	public static ArrayList merge(ArrayList a, ArrayList b)
	{
		ArrayList c = new ArrayList(a.size() + b.size());
		int j = 0;
		int k = 0;
		int l = 0;
		int max = Math.max(a.size(),b.size());
		for (int i = 0; i < max; i++)
		{
			if (j < a.size())
			{
				c.add(l++, a.get(j++));
			}
			if (k < b.size())
			{
				c.add(l++, b.get(k++));
			}
		}
		return c;
	}
}