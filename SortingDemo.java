package classproject;

import java.util.Arrays;


public class SortingDemo {
	public void getSorted(int[] myArray) {
	    String intToString=Arrays.toString(myArray);
		char[] try1 = intToString.toCharArray(); 
	     for (int i = try1.length-1; i>=0; i--) {
	          System.out.println(try1[i]); 
		 }
		 Arrays.sort(try1);
		System.out.println(Arrays.toString(try1));
        }
public static void main(String args[]) {

    int[] myArray = {6,5,3,8};
     SortingDemo d=new SortingDemo();
     d.getSorted(myArray);
    
     
     
}
}
 