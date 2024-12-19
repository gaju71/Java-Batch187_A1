package com.cjc.ims.app.client;

import java.util.Scanner;

import com.cjc.ims.app.serviceimpl.Karvenagar;

public class Test {
	
	

	public static void main(String[] args) {
		
		Karvenagar k=new Karvenagar();
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for addcourse viewCourse\n"
				+ "Enter 2 for addFaculty viewFaculty\n"
				+ "Enter 3 for addBatch viewBatch\n"
				+ "Enter 4 for addStudent viewStudent" );
		
		int x=sc.nextInt();
		
		switch (x) 
		{
		case 1: k.addCourse();
	        	k.viewCourse();
		         break;
		         
		case 2: k.addFaculty();
		        k.viewFaculty();
		         break;
		         
		case 3:k.addBatch();
		       k.viewBatch();
		       break;
			
		case 4:k.addStudent();
		       k.viewStudent();
		       break;
		         
		}
		
	}
}
