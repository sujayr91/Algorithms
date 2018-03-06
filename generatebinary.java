import java.util.*;
import java.io.*;
class generatebinary{

	public static void generateBinary(int n){

		String first = "1";
		LinkedList<String> mylist = new LinkedList<String>();
		mylist.add(first);
		for(int i=2;i<=n;i++){
			mylist.add(mylist.peek() + "0");
			mylist.add(mylist.peek()+ "1");
			System.out.println(mylist.poll());

		}
	}
	public static void main(String[] args){
		
		generateBinary(20);
	}
}
