import java.util.*;
import java.lang.*;
import java.io.*;

class palindrome {
    public static int palindromecount =0;
    public static boolean checkpalindrome(String input,int i, int j, boolean[][]result,boolean[][]memo){
        if(i==j){
            result[i][j] = true;
            if(!memo[i][j])
                palindromecount++;
            memo[i][j] = true;
            return true;
        }
        
        if(memo[i][j]){
            return result[i][j];
        }
        memo[i][j] = true;
        if(input.charAt(i) == input.charAt(j)){
            if(i+1==j){
                result[i][j] = true;
                palindromecount++;
            }else if(checkpalindrome(input,i+1,j-1, result,memo)){
                result[i][j] = true;
                palindromecount++;
            }
        }
        checkpalindrome(input, i,j-1, result, memo);
        checkpalindrome(input, i+1,j, result, memo);
        return result[i][j];
    }
    public static void findAllPalindromes(String input){
        boolean[][] memo = new boolean[input.length()][input.length()];
        boolean[][] result = new boolean[input.length()][input.length()];
        int palindromecount = 0;
        int i=0;
        int j= input.length()-1;
        checkpalindrome(input,i, j, result,memo);
	for(i=0;i<input.length();i++){
		for(j=i;j<input.length();j++){

			if(result[i][j]){
				System.out.println(input.substring(i,j+1));
			}
		}
	}
    }
	public static void main (String[] args) {
		//code
		int testcases = 0;
		Scanner scan = new Scanner(System.in);
		testcases= scan.nextInt();
		scan.nextLine();
		String current ="";
		palindromecount =0;
		for(int testcase=0;testcase<testcases;testcase++){
		    current= scan.nextLine();
		    palindromecount =0;
		    findAllPalindromes(current);
		    System.out.println(palindromecount);
		}
		
	}
}
