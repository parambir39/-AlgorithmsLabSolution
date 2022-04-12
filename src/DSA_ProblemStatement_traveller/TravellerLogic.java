package DSA_ProblemStatement_traveller;

public class TravellerLogic {
	
		public void sortdenomination(int arr[],int low ,int high) {
			
			if(low<high) {
				
				int mid=(low+high)/2;
				
				sortdenomination(arr,low,mid);
				sortdenomination(arr,mid+1,high);
				
				mergeArray(arr,low,mid,high);
			}
		}
		
		
		public void mergeArray(int arr[], int low,int mid, int high) {
			
			
			int i=low;
			int j=mid+1;
			int k=low;
			int sortedarr[]=new int[low+high];
			
			while(i<=mid&&j<=high) {
				if (arr[i]<=arr[j])
				{
					sortedarr[k]=arr[i];
					i++; 
				}
				else {
				
					sortedarr[k]=arr[j];
					j++;
				}
			k++;
			}
			if (i>mid) {
				while(j<high) {
				sortedarr[k]=arr[j];
				j++;k++;
			}
			}
			else {
				while (i<=mid) {
					sortedarr[k]=arr[i];
					i++;k++;
				}
			}
			System.out.println("Merged and sorted array is:" + sortedarr);

			
		}
		
		public void payment(int den[],int size,int val) {
			int no;
			
			for(int i=size-1;i>=0;i--) {
			
				if(val>=den[i]) {
					no=val/den[i];
					System.out.println(den[i]+":"+no);
					val=val-den[i];
				}
			}
					
			
		}

	}

}
