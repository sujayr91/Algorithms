import java.util.*;

class quick{


	public static int findPivot(int[] myarray, int start, int end){
		int pivot= start;
		int i = start+1;
		int j = end;
		int temp =0;
		while(j>=i){
			while(myarray[i] <myarray[pivot]){

				i++;
				if(i==end)
					break;
			}

			while(myarray[j] >= myarray[pivot]){

				j--;
				if(j<i)
				break;
			}
			if(j<i)
				break;
			temp = myarray[i];
			myarray[i] = myarray[j];
			myarray[j] = temp;

		}

		temp =myarray[pivot];
		myarray[pivot] = myarray[j];
		myarray[j] = temp;
		return j;	

	}

	public static void quicksort(int[] myarray, int start, int end){
		if(start >=end){
			return;
		}
		int pivot = findPivot(myarray,start ,end);
		quicksort(myarray, start, pivot-1);
		quicksort(myarray, pivot+1, end);

	}

	public static int quickselect(int[]myarray, int k){

		return 0;	
	}

	public static void main(String[]args){

		int[] myarray =  new int[]{-1,-30,22,100,2,1,32};
		//int[] myarray =  new int[]{1,2,3,4,5,5,6,7};
		//System.out.println(myarray[quickselect(myarray,1)]);
		quicksort(myarray,0,myarray.length-1);
		for(int item: myarray){
			System.out.println(item);
		}
	

	}

}
