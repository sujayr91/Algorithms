import java.util.*;
import java.lang.*;
import java.io.*;

class lcs {
    public static int findMatch(String string2, int index, char c){
        for(int i=index; i>=0; i--){
            if(string2.charAt(i) == c){
                return i;
            }
        }
        return -1;
    }
    public static int findLCS(String string1, String string2, int firstindex, int secondindex, boolean[][] memo, int[][]lengths, int[]backtrack){
        if(firstindex < 0 || secondindex <0 ){
            return 0;
        }
        if(memo[firstindex][secondindex]){
            return(lengths[firstindex][secondindex]);
        }
        int matchindex = -1;
        int present = 0;
        int notpresent =0;
        matchindex = findMatch(string2, secondindex, string1.charAt(firstindex));
        if(matchindex != -1){
            present = 1 + findLCS(string1,string2,firstindex-1, matchindex-1, memo, lengths, backtrack);
        }
        
        notpresent = findLCS(string1, string2, firstindex-1, secondindex, memo, lengths, backtrack);
	if(present > notpresent){
		lengths[firstindex][secondindex] = present;
		backtrack[firstindex] =1;
	}else{
		
		lengths[firstindex][secondindex] = notpresent;
		backtrack[firstindex] = 0;
	}
        memo[firstindex][secondindex] = true;
        return(lengths[firstindex][secondindex]);
    }
	public static void main (String[] args) {
		//code
		int testcases=0;
		Scanner scan = new Scanner(System.in);
		int length1 =0;
		int length2 =0;
		int lcslength =0;
		String string1 ="";
		String string2 = "";
		boolean[][] memo;
		int[] backtrack;
		int[][] lengths;
	    testcases = scan.nextInt();
	    for(int i=0;i< testcases;i++){
	        length1 = scan.nextInt();
	        length2 = scan.nextInt();
		backtrack= new int[length1];
	        memo = new boolean[length1][length2];
	        lengths = new int[length1][length2];
	        scan.nextLine();
	        string1 = scan.nextLine();
	        string2 = scan.nextLine();
	        lcslength=findLCS(string1, string2, length1-1,length2-1, memo, lengths, backtrack);
	        System.out.println(lcslength);
		for(int k=0;k<length1;k++){
			if(backtrack[k] == 1){
				System.out.print(string1.charAt(k));
			}
		}
		System.out.println("");
	    }
	}
}
