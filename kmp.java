import java.util.*;
import java.lang.*;

public class kmp{
	
	public static void constructDFA(int[][] DFA, String pattern){
	
		int stateX =0;
		char[] dict= {'A', 'B', 'C'};
		for(int i=0;i<pattern.length();i++){

			for(char c : dict){
				if(pattern.charAt(i) == c){
					DFA[c - 'A'][i]= i+1;
				}else{
					if(i==0){
						DFA[c - 'A'][i] = 0;
						continue; 
					}
					DFA[c -'A'][i] = DFA[c - 'A'][stateX];
				}
			}
			if(i!=0)
			    stateX= DFA[pattern.charAt(i)-'A'][stateX];
		
		}
		for(int[] i: DFA){
			for(int j:i){
				System.out.print(j + " ");
			}
			System.out.println("");
		}

	}

	public static int searchSubString(int[][]DFA, String input, String pattern){
		int finalstate = pattern.length();
		int j=0;
		for(int i=0;i<input.length();i++){
			j=DFA[input.charAt(i)- 'A'][j];
			if(j==finalstate){
				return (i-finalstate+1);
			}
		}
		return -1;
	}
	public static void main(String[]args){

		int charcount = 3;
		int patterLength =0;
		String input = "AAAABBBBBBBAABABACC";
		String pattern = "ABABAC";
		int patternLength = pattern.length();
		int[][] DFA= new int[charcount][patternLength];
		constructDFA(DFA,pattern);
		System.out.println("Patter match at " + searchSubString(DFA, input, pattern));
		
	}
}
