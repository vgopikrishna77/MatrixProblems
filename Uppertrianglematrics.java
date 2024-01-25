package com.Matrix;

import java.util.Scanner;

public class Uppertrianglematrics {

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
		 for(i=0;i<s;i++) {
			 for(j=0;j<s;j++) {
				 if(i<=j) {
					 b[i][j]=a[i][j];
				 }
				 else {
					 b[i][j]=0;
				 }
			 }
		 }
		 for(i=0;i<s;i++) {
			 for(j=0;j<s;j++) {
				 System.out.print(b[i][j]);
			 }
			 System.out.println(" ");
		 }

	}

}
