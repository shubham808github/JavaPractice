package com.practice.programs;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 153;
		int originalNum = num;
		int sum = 0;
		
		int digits = String.valueOf(num).length();
		
		while(num > 0) {
			
			int digit = num % 10;
			
			sum += Math.pow(digit, digits);
			
			num = num / 10;
			
		}
		
		if (sum == originalNum) {
			System.out.println(originalNum + " is an Armstrong number");
		}else {
			System.out.println(originalNum + " is not an Armstrong number");
		}

	}

}
