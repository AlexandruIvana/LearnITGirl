

import java.util.Scanner;

public class Lesson2 {
		public static void main(String[] args){
		int mySecondArray[];
		Scanner sc= new Scanner(System.in);
		mySecondArray = new int[5];
		
		for (int i=0; i<5; i++){
			System.out.println("Write a number["+i+"]");
			mySecondArray[i] = sc.nextInt();	
		}
		sc.close();
		int max=mySecondArray[0];
		
		for (int i=0; i<5; i++){
			if (mySecondArray[i]>max) {
				max=mySecondArray[i];
			}
		}
		System.out.println(max);
		int help;
		for (int i=0; i<4; i++)
			for (int j=i+1; j<5; j++){
			if (mySecondArray[i]<mySecondArray[j]) {
				help=mySecondArray[i];
				mySecondArray[i]=mySecondArray[j];
				mySecondArray[j]=help;
			}
			}
		for (int i=0; i<5; i++){
			System.out.print(mySecondArray[i]+" ");
		}
			
}
}
