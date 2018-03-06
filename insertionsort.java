import java.util.*;
import java.io.*;
class insertionsort{
	public static void main(String[] args){
		int[] myarray = new int[]{3,4,1,0,0,22,100,2200,-1,55,12};
		int currentelement =0;
		int j=0;
		for(int i=0;i<myarray.length;i++){
			currentelement = myarray[i];
			for(j=i;j>=1;j--){
				if(currentelement < myarray[j-1]){
					myarray[j] = myarray[j-1];
				}else{
					break;
				}
			}
			myarray[j] = currentelement;
		}

		for(int i: myarray){

			System.out.print(i + " ");
		}

	}
}
