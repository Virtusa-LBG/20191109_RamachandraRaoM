package com.virtusa.interview.conversion;

/**
 * This Interface provides provision to convert given number to words in local language
 * @author dhananavyam
 *
 */
public interface INumberConvertion {

	/*
	 * The below abstract method can take input as character array and leave the
	 * implementation to implementor and they can translates number to their
	 * language
	 */
	String translateNumsToWords(char[] num);
}
