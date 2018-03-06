import java.util.*;
import java.io.*;
class knapsack{

	public static boolean findSubset(int[] myarray, int[] paths, int sum, int reqsum, int startindex, int length){
		if(startindex == myarray.length){
			return false;
		}

		if(sum==reqsum){
			for(int i=0;i<length;i++){
				System.out.print(paths[i]+ " ");
			}
			System.out.println("");
			return true;
		}
		boolean found = false;
		for(int i=startindex; i<myarray.length;i++){

			sum+= myarray[i];
			paths[length] = myarray[i];
			found=found|findSubset(myarray, paths, sum, reqsum, i+1, length+1);
			sum-=myarray[i];
			found= found|findSubset(myarray, paths, sum, reqsum, i+1, length);
			if(found){
				break;
			}

		}

		return found;

		
	}
	public static void main(String[] args){
		int[] myarray = new int[]{1,2,3,5,7,11};
		int[] paths = new int[myarray.length];
		findSubset(myarray, paths, 0, 8, 0, 0);

	}
}
