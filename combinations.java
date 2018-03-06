import java.util.*;
import java.io.*;
class combinations{
	public static void choose(int fillindex,int startindex,int[]myarray, int[]result){
		if(fillindex==result.length){
			for(int i=0;i<result.length;i++){
				System.out.print(result[i] + " ");
	
			}
			System.out.println("");
			return;
		}
		for(int i=startindex;i<myarray.length;i++){
			result[fillindex] = myarray[i];
			choose(fillindex+1,i+1,myarray,result);
		}
	}

	public static void permute(int fillindex,int[]myarray, int[]result, boolean[]present){
		if(fillindex==result.length){
			for(int i=0;i<result.length;i++){
				System.out.print(result[i] + " ");
	
			}
			System.out.println("");
			return;
		}
		for(int i=0;i<myarray.length;i++){
			if(present[i]){
				continue;
			}
			result[fillindex] = myarray[i];
			present[i] = true;
			permute(fillindex+1,myarray,result,present);
			present[i] = false;
		}
	}
	public static void main(String[] args){
			int[] myarray= new int[]{1,2,3,4,5,6,7,8,9};
			int[] result= new int[8];
			boolean[] present = new boolean[4];
			choose(0,0,myarray,result);

	}
}
