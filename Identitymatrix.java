package com.Matrix;

import java.util.Scanner;

public class Identitymatrix {

	public static void main(String[] args) {
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
		/* for(i=0;i<s;i++) {
			 for(j=0;j<s;j++) {
				 b[i][j]=c.nextInt();
			 }
		 }*/
		 int k=0,d=0;
		 for(i=0;i<s;i++) {
			 for(j=0;j<s;j++) {
				 if(((i!=j) && (a[i][j]==0)) || ((i==j) && (a[i][j]==1))) {
					 k=k+1;
				 }
				 else {
					 d=d+1;
				 }
			 }
		 }
		 if(k==s*s) {
			 System.out.println("identityematrix");
		 }
		 else {
			 System.out.println("not a identity matrix");}
		 for(i=0;i<s;i++) {
			 for(j=0;j<s;j++) {
				 System.out.print(a[i][j]);
			 }
			 System.out.println(" ");
		 }

		// TODO Auto-generated method stub

	}

}
