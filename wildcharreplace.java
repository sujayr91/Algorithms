import java.util.*;
import java.io.*;
class wildcharreplace{
	public static void printcomb(char[]myarray, int startindex){
		if(startindex==myarray.length){
			System.out.println(new String(myarray));
			return;
		}
		int i=startindex;
		if(myarray[i] == '?'){
				myarray[i] = '0';
				printcomb(myarray, i+1);
				myarray[i] ='1';
				printcomb(myarray,i+1);
				myarray[i]='?';
		}else{
			printcomb(myarray,i+1);
		}
	}
	public static void main(String[] args){
		String input="1?11?00?1?";
		System.out.println(input);
		printcomb(input.toCharArray(),0);

	}
}
