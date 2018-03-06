import java.util.*;
import java.io.*;
class permutation{
	public static void permute(int[] myarray, int startindex){
		if(startindex == myarray.length){
			for(int i: myarray)
				System.out.print(i + " ");
			System.out.println("");
			return;
		}
		int temp =0;
		for(int j=startindex;j<myarray.length;j++){
			temp=myarray[startindex];
			myarray[startindex] = myarray[j];
			myarray[j] = temp;
			permute(myarray, startindex+1);
			temp=myarray[startindex];
			myarray[startindex] = myarray[j];
			myarray[j] = temp;

		}

	}
	public static void main(String[] args){
		int[] myarray = new int[]{1,2,3,4};
		permute(myarray,0);	

	}
}
