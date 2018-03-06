import java.util.*;
import java.io.*;
class excel{
	public static void main(String[] args){

		int x = 39;
		StringBuilder s= new StringBuilder("");
		while(x!=0){
			if(x%26==0){
				s.append('Z');
				if(x==26)
					break;
			}else{
				s.append((char)(x%26 +'A' -1));
			}
			x=x/26;
		}
		System.out.println(s.reverse().toString());
	}
}
