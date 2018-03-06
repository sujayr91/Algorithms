import java.util.*;
import java.io.*;

class quicksort{

	public static int findPivot(int[] myarray, int low, int high){

		int pivot=low;
		int i=low+1;
		int j= high;
		int temp=0;
		while(true){
			while((myarray[i] < myarray[pivot] )&& i<high){
				i++;
			}

			while(myarray[j] >= myarray[pivot] && (j>=i)){
				j--;
			}
			if(i >=j){
				break;
			}

			temp = myarray[i];
			myarray[i] = myarray[j];
			myarray[j] = temp;	

		}
		temp = myarray[pivot];
		myarray[pivot] =myarray[j];
		myarray[j] = temp;
		return j;

	}

	public static int quickselect(int[] myarray, int low, int high, int k){

		if(low>=high){
			return -1;
		}
		int pivot = findPivot(myarray, low, high);
		if(k==pivot){
			return pivot;
		}
		if(k<pivot){
			return(quickselect(myarray, low, pivot-1,k));
		}else{
			return(quickselect(myarray, pivot+1,high,k));
		}
		
	}

	public static void quick_sort(int[] myarray, int low, int high){
		if(low>=high){
			return;
		}
		int pivot = findPivot(myarray, low, high);
		quick_sort(myarray, low, pivot-1);
		quick_sort(myarray,pivot+1, high);
	
	}

	public static void main(String[] args){

		int[] myarray= new int[]{-1,-30,22,100,2,1,32};
		quick_sort(myarray, 0, myarray.length-1);
		System.out.println(myarray[quickselect(myarray, 0,myarray.length-1, 5)]);
		for(int i:myarray){
			System.out.println(i);
		}

	}

}
