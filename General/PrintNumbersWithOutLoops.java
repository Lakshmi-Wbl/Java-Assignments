package com.General;

public class PrintNumbersWithOutLoops {

	
		public static void main(String[] args) {
			printNumbers(10);
		}

		private static void printNumbers(int i) {

			if (i > 0) {
				printNumbers(i - 1);
				System.out.println(i);
			}
		}

	}


