import java.util.Scanner;

	class BicycleDemo {
	    public static void main(String[] args) {

	    	Scanner sc = new Scanner(System.in);
	        String a = sc.nextLine();
	        int age=sc.nextInt();
	        sc.close();
	        
	        System.out.println(a + age);
	        // Create two different 
	        // Bicycle objects
	        Bicycle bike1 = new Bicycle();
	        Bicycle bike2 = new Bicycle();
	        
	        // Invoke methods on 
	        // those objects
	        bike1.changeCadence(50);
	        bike1.speedUp(10);
	        bike1.changeGear(2);
	        bike1.printStates();

	        int a7[] = new int[20];
	        
	        bike2.changeCadence(50);
	        bike2.speedUp(10);
	        bike2.changeGear(2);
	        bike2.changeCadence(40);
	        bike2.speedUp(10);
	        bike2.changeGear(3);
	        bike2.printStates();
	    }
	}
