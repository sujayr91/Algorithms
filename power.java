import java.util.*;
import java.io.*;
class power{
	public static int findPower(int x,int power){
		if(power==0)
			return 1;
		int pow = findPower(x, power/2);
		if((power & 1) !=0){
			return x*pow*pow;
		}
		return pow*pow;
	}
	public static void main(String[] args){

		System.out.println(findPower(2,8));
	}
}
