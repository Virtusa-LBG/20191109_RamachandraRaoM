package com.virtusa.interview.conversion.client;

import com.virtusa.interview.conversion.impl.NumberToWords;

public class Client {

	public static void main(String[] args) {

		NumberToWords numTo = new NumberToWords();
		String input_number = "8569";
		System.out.println("Convert number "+input_number +" and in Words ::  "+numTo.translateNumsToWords(input_number.toCharArray()));

	}

}
