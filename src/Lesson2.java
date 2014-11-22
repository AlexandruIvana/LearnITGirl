import java.util.Scanner;

public class Lesson2 
{
		public static void main(String[] args)
		{
			int mySecondArray[];
			int help;
			int invert = 0;
			int loopHelper;
			
			Scanner sc= new Scanner(System.in);
			mySecondArray = new int[5];
		
			for (int i=0; i<5; i++)
			{
				System.out.println("Write a number["+i+"]");
				mySecondArray[i] = sc.nextInt();	
			}
			
			sc.close();
			int max=mySecondArray[0];
		
			for (int i=0; i<5; i++)
			{
				if (mySecondArray[i]>max) 
				{
				max=mySecondArray[i];
				}
			}
			
		System.out.println(max);
		
		for (int i=0; i<4; i++)
			for (int j=i+1; j<5; j++)
			{
				if (mySecondArray[i]<mySecondArray[j]) 
				{
					help=mySecondArray[i];
					mySecondArray[i]=mySecondArray[j];
					mySecondArray[j]=help;
				}
			}
		
		for (int i=0; i<5; i++)
		{
			System.out.print(mySecondArray[i]+" ");
		}
			
		int helper = max;
		
		while (helper !=0){
			invert=invert*10+helper%10;
			helper=helper/10;
		}
		if (max==invert){
			System.out.println("Max is a palindrome");
		}
		else 
		{
			System.out.println("Max is not a palindrome");
		}
		
		for (int i=0; i<5; i++) 
		{
			invert=0;
			loopHelper=mySecondArray[i];
			 while (loopHelper != 0)
			 {
				 invert=invert*10+loopHelper%10;
				 loopHelper=loopHelper/10;
			 }
			 
			 if (mySecondArray[i]==invert) 
			 {
				 System.out.println("It is a palindrome");
			 }
			 else 
			 {
				 System.out.println("It is not");
			 }
		}
	}
}
