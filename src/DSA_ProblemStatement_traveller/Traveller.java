package DSA_ProblemStatement_traveller;
import java.util.Scanner;

public class Traveller {




	public static void main(String[] args) {
		 int size = 0;
		 int val;
		 int den[]= new int[size];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of denominations");

		size=sc.nextInt();

		System.out.println("Enter the currency denomination vlaue");
		for(int i=0;i<size;i++) {
				den[i]=sc.nextInt();
		}
		
		System.out.println("Enter value you want to pay");
		val=sc.nextInt();
		
		TravellerLogic obj=new TravellerLogic();
		obj.sortdenomination(den,0,den.length-1); //for sorting and merging array
		obj.payment(den,size,val);    // for currency denomination value			
		sc.close();
	}  



	}


	/*Enter the size of currency denominations
	3
	Enter the currency denominations value
	5
	1
	10
	Enter the amount you want to pay
	12
	Your payment approach in order to give min no of notes will be
	10:1
	1:2
	*/
}
