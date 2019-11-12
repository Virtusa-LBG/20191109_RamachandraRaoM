package com.virtusa.interview.conversion;

import com.virtusa.interview.conversion.impl.NumberToWords;

public class NumbersToWordsTest {

	
	public static void main(String[] args) {
		
		testConvertSingleDigitToWord();
		testConvertTwoDigitsToWord();
		testConvertThreeDigitsToWord();
		testConvertFourDigitsToWord();

	}
	
	private static void testConvertSingleDigitToWord() {
		NumberToWords numTo = new NumberToWords();		
		String input_number = "9";
		System.out.println("Convert number "+input_number +" and in Words ::  "+numTo.translateNumsToWords(input_number.toCharArray()));
		
	}
	
	private static void testConvertTwoDigitsToWord() {
		NumberToWords numTo = new NumberToWords();		
		String input_number = "56";
		System.out.println("Convert number "+input_number +" and in Words ::  "+numTo.translateNumsToWords(input_number.toCharArray()));
		
	}
	
	private static void testConvertThreeDigitsToWord() {
		NumberToWords numTo = new NumberToWords();		
		String input_number = "852";
		System.out.println("Convert number "+input_number +" and in Words ::  "+numTo.translateNumsToWords(input_number.toCharArray()));
		
	}
	
	private static void testConvertFourDigitsToWord() {
		NumberToWords numTo = new NumberToWords();		
		String input_number = "5647";
		System.out.println("Convert number "+input_number +" and in Words ::  "+numTo.translateNumsToWords(input_number.toCharArray()));
		
	}
	
}
