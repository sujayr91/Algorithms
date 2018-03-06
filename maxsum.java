import java.util.*;
import java.lang.*;
import java.io.*;

class maxsum {
    public static int findMaxSumSeq(int index, int[] inputarray, int[]maxsum, boolean[] processed){
        if(index == inputarray.length){
            maxsum[index] = inputarray[index];
            processed[index] = true;
            return maxsum[index];
        }
        if(processed[index]){
            return maxsum[index];
        }
        maxsum[index] = inputarray[index];
        int currentmax =  maxsum[index];
        for(int j=index+1; j< inputarray.length;j++){
            if(inputarray[j] > inputarray[index]){
                currentmax = inputarray[index] + findMaxSumSeq(j, inputarray, maxsum, processed);
                if(currentmax > maxsum[index]){
                    maxsum[index] = currentmax;
                }
                
            }
        }
        
        processed[index] = true;
        return(maxsum[index]);
        
    }
    public static void main (String[] args) {
		//code
    	Scanner scan = new Scanner(System.in);
    	int testcases = scan.nextInt();
    	int[] myinput;
    	boolean[] processed;
    	int[] maxsum;
    	int N =0;
    	for(int i=0;i<testcases;i++){
    	    N = scan.nextInt();
    	    myinput = new int[N];
    	    processed = new boolean[N];
    	    maxsum = new int[N];
    	    for(int j=0;j<N;j++){
    	        myinput[j]= scan.nextInt();
    	    }
    	    for(int j=0;j<N;j++){
    	        findMaxSumSeq(j, myinput, maxsum, processed);
		System.out.println(myinput[j]);
    	    }
    	    int max = maxsum[0];
    	    for(int j=1;j< N;j++){
    	        if(maxsum[j] > max)
    	            max = maxsum[j]; 
    	    }
    	    System.out.println(max);
    	    
    	}
    }
}
