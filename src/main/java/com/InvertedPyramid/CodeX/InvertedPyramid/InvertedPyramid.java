package com.InvertedPyramid.CodeX.InvertedPyramid;

public class InvertedPyramid {
  public static void invertedPyramidDesign(int n)
  {
	// number of lines / rows & columns controller
			for (int i=1;i<=n;i++) {
				// number of space controllers
				for (int j=1;j<i;j++) {
					System.out.print(" ");
				}
				// number of symbols controller
				for (int z=n;z>i-1;z--) {
					System.out.print("=");
				}
				/* creating mirror image on the symbol creation by extending
				 *  n-1 elements to its right
				*/
				for (int x=n-i;x>=1;x--) {
					System.out.print("=");
				}
				// new line
				System.out.println();
			}
  }
}
