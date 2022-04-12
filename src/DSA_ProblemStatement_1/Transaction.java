package DSA_ProblemStatement_1;
import java.util.Scanner;



public class Transaction {
public static void main(String[] args) {
	
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the transaction array:");
		
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter values of the array:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter total no. of targets to be achieved:");
		int numtarget=sc.nextInt();
		
		TransactionLogic obj=new TransactionLogic();
		while (numtarget>0) {
			for(int a=0;a<numtarget;a++) {
				System.out.println("Enter value of target(s)"+a);
			int target=sc.nextInt();
			obj.check(arr,target);
			numtarget--;
			}
			
			sc.close();
		}

	}

}

}
