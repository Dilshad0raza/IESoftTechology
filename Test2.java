//input
//aabbccdd
//output
//d2c2b2a2:49fir1mt

package org.com.IESoftTestProgram;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.nextLine();
		System.out.println(isCheck(str));
       
	}

	 static String isCheck(String str) {
		 
		 String res="";
		 char []c=str.toCharArray();
		 boolean b[]=new boolean[c.length];
		 for(int i=0;i<c.length;i++) {
			 int count=0;
			 if(b[i]==false) {
				 for(int j=0;j<c.length;j++) {
					 if(c[i]==c[j]) {
						 count++;
						 b[j]=true;
					 }
				 }
				 res=c[i]+""+count+""+res;
			 }
		 }
		return res+":49fir1mt";
	}

}
