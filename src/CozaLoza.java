
public class CozaLoza {
	public static void main (String[] args)
	{
		int number;
		number = 0;
		int i;
		i = 0;
	    while (number<110) 
	    {
	    	number++;
	    	i++;
	    	if ((number%3 == 0) && (number%5 == 0) && (number%7 ==0)) System.out.print("CozaLozaWoza "); else
	    	if ((number%3 == 0) && (number%5 == 0)) System.out.print("CozaLoza "); else
	    	if ((number%3 == 0) && (number%7 == 0)) System.out.print("CozaWoza "); else
	    	if ((number%5 == 0) && (number%7 == 0)) System.out.print("LozaWoza "); else
	    	if (number%3 == 0) System.out.print("Coza "); else
	    	if (number%5 == 0) System.out.print("Loza "); else
	    	if (number%7 == 0) System.out.print("Woza "); else
	    	System.out.print(number + " "); 
	    	if (i%11 == 0) System.out.println();
	    	
			//System.out.print(number + " ");
			//while (number%3 == 0) System.out.println("Coza");
	
	    }
		
	}

}
