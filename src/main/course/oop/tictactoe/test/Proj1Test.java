package main.course.oop.tictactoe.test;

import main.course.oop.tictactoe.util.TwoDArray;

public class Proj1Test {

	private static void runBasicTest(int maxLen, int maxVal, int defaultVal) {
		/**
		 * java.lang.Math.random() - returns a 
		 * pseudorandom double greater than or 
		 * equal to 0.0 and less than 1.0.
		 */
		int colLen = (int)(Math.random() * maxLen+1);		
		int rowLen = (int)(Math.random() * maxLen+1);		
		//TwoDArray arr2d = new TwoDArray (rowLen, colLen, defaultVal);
		TwoDArray arr2d = new TwoDArray (rowLen, colLen, defaultVal);
		System.out.println("# rows: "+rowLen+", # cols: "+ colLen);

		
		int testRow = 0, testCol = 0, testVal = 0;
		for(int i = 0; i< rowLen * colLen; i++) {
			/**
			 * The method floor() gives the largest integer 
			 * that is less than or equal to the argument.
			 */
			int col = (int)Math.floor((Math.random() * colLen));		
			int row = (int)Math.floor((Math.random() * rowLen));
			int val = (int)(Math.random() * maxVal);
			if(i == 0) {
				testRow=row;
				testCol=col;
				testVal=val;
			}
			
			System.out.println("Insert -> ["+row+"]["+col+"] ="+val);
			arr2d.insertInt(row, col, val);
		}
		int returnedVal = arr2d.getInt(testRow, testCol);
		System.out.println("Expecting: "+testVal+", returned: "+returnedVal+". Test passed: "+ (testVal==returnedVal));		
		System.out.println("Details: "+arr2d.getArrayDetails());
		System.out.println("Display: "+arr2d.getArrayDisplay());
	}
	
	public static void main(String[] args) {
		Proj1Test.runBasicTest(5, 10, 3);		
	}

}
