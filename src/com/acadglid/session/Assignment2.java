/*
 * Problem Statement
   Write a program to generate a user-defined exception called NegativeAgeException 
   if the user inputs negative value for age.

	Expected Output
   Generating NegativeAgeException if user inputs negative value for age.
 */

package com.acadglid.session;

import java.util.Scanner;

public class Assignment2 {
	
	public static void main(String[] args) throws NegativeAgeException {
		
		
		int age;
		
		System.out.println("Enter your age");
		
		Scanner sc = new Scanner(System.in);
		
		age = sc.nextInt();
		

        try
        {
            if(age < 0)
            {
                throw new NegativeAgeException();    //throws an Exception if age is negative
            }
        }
        catch(NegativeAgeException ex)
        {
            System.out.println(ex);     //Prints exception description
        }
  }
		
		
		
	}


