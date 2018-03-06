import java.util.*;
import java.io.*;
import java.lang.*;

class longestsub {
    public static int findMax(int[] myarray){
	
        int max = myarray[0];
        for(int i=1;i<myarray.length;i++){
            if(myarray[i] > max){
                max = myarray[i];
            }
        }
        return max;
        
    }
    public static int findLength(int index, int[] nums, int lengths[], boolean[] processed){
            if(index == nums.length){
                lengths[index] = 1;
                processed[index] = true;
                return 1;
            }
            if(processed[index]){
                return lengths[index];
            }
            lengths[index]=1;
            int current = 0;
            for(int i=index+1;i<nums.length;i++){
                if(nums[i] > nums[index]){
                    current = 1+ findLength(i, nums, lengths, processed);
                    if(lengths[index] < current){
                        lengths[index] = current;
                    }
                }
            }
            processed[index] = true;
            return lengths[index];
    }
    public static int lengthOfLIS(int[] nums) {
        int[] lengths = new int[nums.length];
        boolean[] present = new boolean[nums.length];
        for(int i=0;i<nums.length;i++)
            findLength(i, nums,lengths, present);
        return(findMax(lengths));
    }
    public static void main(String[] args){

	int[] myarray = new int[]{45,24,5,2,43};
	System.out.println(lengthOfLIS(myarray));
   }
}
