import java.util.*;
import java.io.*;
class bittest{
	public static String invertCase(String mystring){
		String invertstring = "";
		for(int i=0;i<mystring.length();i++){
			char ch= mystring.charAt(i);
			invertstring = invertstring + Character.toString((char)(ch ^ ' '));
		}
		System.out.println(invertstring);
		return invertstring;
	}
	public static String convertBinary(int x){
		String binary="";
		int count = 32;
		while(x!=0){
			binary = binary + (x & 1);
			x=x>>1;
		}
		String finalstring = new StringBuilder(binary).reverse().toString();
		return(finalstring);
	}
	public static void main(String[] args){
		int x=45;
		int y = -28;
		int z =0;
		invertCase("Sujay");
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		System.out.println(convertBinary(x));
		z = -(~x);
		System.out.println(z);
		if((x ^ y) < 0)
			System.out.println("Different Sign");

	}
}
