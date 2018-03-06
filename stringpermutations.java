import java.util.*;
import java.io.*;
class stringpermutations{
	public static void permute(char[] mystring,int startindex){
		if(startindex==(mystring.length-1)){
			
			System.out.println(new String(mystring));
			return;
		}
		char temp= 'A';
		for(int i=startindex;i<(mystring.length);i++){
			temp= mystring[i];
			mystring[i] = mystring[startindex];
			mystring[startindex] = temp;
			permute(mystring,startindex+1);
			temp=mystring[i];
			mystring[i] = mystring[startindex];
			mystring[startindex] = temp;
		}
	}
	public static void main(String[] args){
		String input = "sujay";
		permute(input.toCharArray(),0);

	}
}
