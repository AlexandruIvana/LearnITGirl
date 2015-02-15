

public class klasa {
	public static void main(String[] args){
		int average = 141;
		System.out.println(average);

		int invert=0;
		int help = average;
		while (help !=0) {
			
			invert=invert*10+help%10;
			help=help/10;	
		}
		System.out.println(invert);
		if (average == invert) {
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("it is not");
		}
    }

}
