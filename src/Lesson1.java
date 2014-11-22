
public class Lesson1 
{
	public static void main(String[] args)
	{
		int average = 0;	
	    average = average + 2;
	    
		for (int i=12; i>1; i--)
		{
			if (i%2 == 0) 
			{
			System.out.println(average);
			average = (average + i);
			}
		}
		
		System.out.println(average);
		System.out.println(average);
		
		average=average*10+1;
		int invert=0;
		
		while (average !=0) 
		{
			invert=invert*10+average%10;
			average=average/10;
			System.out.println(average+"first");
		}
		
		System.out.println(invert);
	}
}