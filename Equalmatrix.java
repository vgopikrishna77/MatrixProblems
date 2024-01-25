package com.Matrix;

import java.util.Scanner;

public class Equalmatrix {

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
		 }for(i=0;i<s;i++) {
			 for(j=0;j<s;j++) {
				 b[i][j]=c.nextInt();
			 }
		 }
		 int k=0;
		 for(i=0;i<s;i++) {
			 for(j=0;j<s;j++) {
			 
					 if(b[i][j]==a[i][j]) {
						 k=k+1;
					 } 
		 }}
			 if(k==s*s) {
				 System.out.println("equal");
				 }
			 else {
				 System.out.println("not equal");
				 
			 }
			 
		 
	}

}
