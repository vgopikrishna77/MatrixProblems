package com.Matrix;

import java.util.Scanner;

public class FrequencyOfEvenandOddmatrics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s,i,j;

		Scanner c=new Scanner(System.in);
		 s=c.nextInt();
		 // TODO Auto-generated method stub
		 int a[][]=new int[s][s];
		 int b[][]=new int[s][s];
		 for(i=0;i<s;i++) {
			 for(j=0;j<s;j++) {
				 a[i][j]=c.nextInt();
			 }
		 }
		 int e=0,d=0;;
		 for(i=0;i<s;i++) {
			 for(j=0;j<s;j++) {
				 if(a[i][j]%2==0) {
					 e=e+1;
				 }
				 else {
					 d=d+1;
				 }
			 }
		 }
		 
			 System.out.println(" even are:"+e+"  odd elements are:"+d);
		 
	}

}
