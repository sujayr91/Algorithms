import java.util.*;
import java.io.*;
class stringcompress
{
	public static String compress(String input){
		if(input== null){
			return null;
		}
		int length = input.length();
		String compressed ="";
		int prevcount =1;
		int i=1;
		for(i=1;i<length;i++){

			if(input.charAt(i)==input.charAt(i-1)){

				prevcount++;
			}else{
				compressed = compressed+ input.charAt(i-1) + prevcount;
				prevcount=1;
			}
		}

		compressed = compressed+ input.charAt(i-1) + prevcount;
		return compressed;
		
	}
	public static void main(String[] args){
			String input ="AAVVBBCCCD";
			System.out.println(compress(input));

	}
}
