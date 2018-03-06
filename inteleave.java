import java.util.*;
import java.io.*;
class inteleave{
	public static void printinterleave(String a, String b, char[] myarray){
		boolean[] filled = new boolean[myarray.length];
		int aindex=0;
		int bindex=0;
		for(int i=0;i<(myarray.length-a.length()+1);i++){
			for(aindex=0;aindex<a.length();aindex++){
				filled[i+aindex]= true;
				myarray[i+aindex] = a.charAt(aindex);
			}
			for(int j=0;j<myarray.length;j++){

				if(!filled[j]){
					myarray[j] = b.charAt(bindex);
					bindex++;
				}
			}
			for(int j=0;j<myarray.length;j++){
				filled[j] = false;
			}
			bindex=0;
			System.out.println(new String(myarray));
		}
		
	}
	public static void printall(String a, String b, char[] myarray, int fillindex,int aindex, int bindex){

		if(fillindex==myarray.length){
			System.out.println(new String(myarray));
			return;
		}
		if(aindex < a.length()){
			myarray[fillindex] = a.charAt(aindex);
			printall(a,b,myarray,fillindex+1, aindex+1,bindex);
		}
		if(bindex < b.length()){
			myarray[fillindex] = b.charAt(bindex);
			printall(a,b,myarray, fillindex+1, aindex, bindex+1);
		}
	}
	public static void main(String[] args){
		String a="ABC";
		String b="ACB";
		char[] myarray= new char[a.length()+b.length()];
		printinterleave(a,b, myarray);
		printinterleave(b, a, myarray);

	}
}
