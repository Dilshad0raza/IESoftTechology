///input 
/// i love dogs
////output
 //// evol:49fri1mt


package org.com.IESoftTestProgram;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println(isSolution(s.nextLine()));
	}

	 static String isSolution(String str) {
		String res="";
		String s[]=str.split(" ");
         int temp=0;
		for(int i=0;i<s.length;i++) {
			int sum=0;
			
			char c[]=s[i].toCharArray();
			for(int j=0;j<c.length;j++) {
				sum=sum+c[j];
			}
			if(sum>temp) {
				res=new String(c);
				temp=sum;
			}
		}
		String rev="";
		for(int i=0;i<res.length();i++) {
			char c=res.charAt(i);
			rev=c+rev;
		}
		
		return rev+":49fri1mt";
	}

}
