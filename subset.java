import java.util.*;
import java.io.*;
class subset{

	public static void printAllDistinct(char[]myarray){
		int count = myarray.length;
		int totalstates = (1<<(count));
		int currentstate = 0;
		int currentbit = 0;
		for(int i=0;i<totalstates;i++){
			currentstate =i;
			for(int j=0;j<count;j++){
				currentbit = currentstate & 0x01;
				if(currentbit==1){
					System.out.print(myarray[count-j-1] + " ");
				}

				currentstate = currentstate >>1;

			}
			System.out.println("");
	
		}

	}
	public static void main(String[] args){

		char[] myarray = new char[]{'x', 'y' , 'z'};
		printAllDistinct(myarray);	
	}
}
