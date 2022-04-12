package DSA_ProblemStatement_1;

public class TransactionLogic {

	

	public void check(int[] arr, int target) {
		// TODO Auto-generated method stub

		long sum=0;
		int i=0;
		while(i< arr.length) {
			sum=sum+ arr[i];
			if (sum>=target) {
				System.out.println("Target achieved after "+ (i+1)+ " transactions");
			break;
			}
			i++;
		}
		if (i==arr.length && target>sum) {
			System.out.println("Target cannot be achieved");
		}
	}



}

