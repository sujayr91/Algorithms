import java.util.*;
import java.io.*;
class highlow{
	public static void main(String[] args){
		int[] myarray = new int[]{3,4,5,6,-1,55,-4,0,6};
		int temp =0;
		for(int i=1;i<myarray.length-1;i=i+2){
			if(myarray[i-1] > myarray[i]){
				temp = myarray[i];
				myarray[i] = myarray[i-1];
				myarray[i-1] = temp;	
			}
			if(myarray[i+1] > myarray[i]){
				temp = myarray[i];
				myarray[i] = myarray[i+1];
				myarray[i+1] = temp;	
			}

		}
		for(int i:myarray){
			System.out.print(i+ " ");
		}

	}
}
