package greatlearninglab3;

import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {

			// input the size of transaction array
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Enter the size of transaction array");
			
			int size = sc.nextInt();
			
			int array[] = new int[size];
			
			
			// input the values of array
			System.out.println("Enter the values of array");
			
			for (int k=0 ; k < size ; k++) 
				
				array[k] = sc.nextInt();
			
			
			// input the number of targets required
			System.out.println("Enter the total no of targets that needs to be achieved");
			
			int t = sc.nextInt(); // t = number of targets
			
			// input for targets
			while(t--!=0) {
				
				int flag =0;
				double target;
				
				System.out.println("Enter the value of target");
				target = sc.nextInt();
				
				double sum = 0;
				
				for (int j=0 ; j< size; j++) {
					
					
					sum = sum + array[j];
					
					if(sum>=target) {
						
					
					
					System.out.println("Target is achieved after" + " " +(j+1)+" " + "transactions");
					
					flag =1;
					break;
					
				}
				
				}
			
		if(flag==0) {
			
			System.out.println("Given target is not achieved");
			
			
		}
			
			

	}

}
}