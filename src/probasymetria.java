

import java.util.Scanner;

public class probasymetria {




		/*private static boolean verifyIfNumberIsPrime(int number)
		{
			for (int i=2; i<number; i++)
			{
				if (number%i==0)
				{
					return false;
				}
				else 
				{
					return true;
				}
			}
			return true;
		}
		*/
		public static void main(String[]args){
	    	int[] numbers = new int [5];
	    	Scanner scanner = new Scanner(System.in);
	    	/*for (int i=0; i<5; i++)
	    	{
	    		System.out.println("Write numbers[" + i + " ] = ");
	    		numbers[i] = scanner.nextInt();
	    		System.out.println(verifyIfNumberIsPrime(numbers[i]));
	    	
	    	}
	    	*/
	    	
	    	int[][] matrix = new int[4][4];
	    	for (int i=0; i<4; i++)
	    		for (int j=0; j<4; j++)
	    		{
	    			System.out.println("Write matrix [ " + i + "]["+ j + "] = ");
	    			matrix[i][j]=scanner.nextInt();
	    		}
	    	for (int i=0; i<4; i++)
	    		for (int j=0; j<4; j++)
	    		{
	    			if (j==0)
	    			System.out.println(matrix[i][j]);
	    			else 
	    			System.out.print(matrix[i][j]);
	    			
	    		}
	    	for (int i=0; i<4; i++)
	    	    for (int j=0; j<4; j++)
	    	    {
	    	    	if (j>i)
	    	    		if (j==1)
	    	    	    System.out.println(matrix[i][j]);
	    	    		else
	    	    		System.out.print(matrix[i][j]);
	    	    }
	    	scanner.close();
	    

		}
}
