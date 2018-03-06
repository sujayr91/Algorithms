import java.util.*;
import java.io.*;
class pairsum{

	public static void main(String[] args){
		int [] myarray = new int[]{8,7,2,5,3,1};
		int sum = 10;
		HashMap<Integer, Integer> mymap = new HashMap<Integer, Integer>();
		for(int i=0;i<myarray.length;i++){
			if(mymap.containsKey(sum - myarray[i])){
				System.out.println("Pairs are " + myarray[mymap.get(sum-myarray[i])] + "," + myarray[i]);

			}else{
				mymap.put(myarray[i], i);
			}
		}

	}
}
