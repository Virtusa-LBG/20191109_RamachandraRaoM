package com.virtusa.interview.conversion.impl;

import com.virtusa.interview.conversion.INumberConvertion;
import com.virtusa.interview.conversion.constant.Constant;

/**
 * This class convert given number to English language
 * @author dhananavyam
 *
 */
public class NumberToWords implements INumberConvertion{


	@Override
	public final String translateNumsToWords(char[] num) {

		int len = num.length;
		
		StringBuilder resultBuilder = new StringBuilder();
		
		if (len == 1) {
			resultBuilder.append(Constant.single_digits[num[0] - '0']);
			
			return resultBuilder.toString();
		}

		int x = 0;

		while (x < num.length) {

			/* Below code for first 2 digits */
			if (len >= 3) {
				if (num[x] - '0' != 0) {
					resultBuilder.append(Constant.single_digits[num[x] - '0'] + " ").append(Constant.tens_power[len - 3] + " ");
					// here length can be 3 or 4
				}
				--len;
			}

			/* Below code for last 2 digits */
			else {
				/*
				 * Handle 10 to 19. Sum of the two digits is used as index of
				 * "two_digits" array of strings
				 */
				if (num[x] - '0' == 1) {
					int sum = num[x] - '0' + num[x] - '0';
					resultBuilder.append(Constant.two_digits[sum]);
					return resultBuilder.toString();
				}

				/* Explicitly handle 20 */
				else if (num[x] - '0' == 2 && num[x + 1] - '0' == 0) {
					resultBuilder.append("twenty");
					return resultBuilder.toString();
				}

				/*
				 * Rest of the two digit numbers i.e., 21 to 99
				 */
				else {
					int i = (num[x] - '0');
					if (i > 0) {
					resultBuilder.append(Constant.tens_multiple[i] + " ");
					}
					else {
						resultBuilder.append("");
					}
					++x;
					if (num[x] - '0' != 0)
					resultBuilder.append(Constant.single_digits[num[x] - '0']);
				}
			}
			++x;
		}
		return resultBuilder.toString();
	}

}
