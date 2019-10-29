package com.InvertedPyramid.CodeX.InvertedPyramid;

import java.util.Scanner;

/**
 * Create inverted pyramid design
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// Scanner object
    			Scanner myObj = new Scanner(System.in);
    			// User has to decide how many number of lines 
    			System.out.println("Please enter the number of lines or inverted pyramid levels");
    			int n = myObj.nextInt();
    			myObj.close();
    			InvertedPyramid.invertedPyramidDesign(n);
    }
}
