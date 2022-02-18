package com.bridgelabz.regexExpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexExpression {
	static Scanner scanner = new Scanner(System.in);
	public static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}";
	public static final String LAST_NAME_REGEX = "^[A-Z][a-z]{2,}";
	public static final String EMAIL_ID_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	public static final String MOBILE_NUMBER_REGEX = "[0-9]{2}\\s[1-9]{1}[0-9]{9}";
	public static final String PASSWORD_REGEX = "^(?=.*[!@#$%^&*|'<>.-^*()%!])(?=.*[0-9])(?=.*[A-Z])[^\\s]{8,}$";
//	public static final String MOBILE_NUMBER_INVALID_MSG = "Mobile Number Not valid";
	
	public static void main(String[] args) {
		System.out.println("Regex to check");
		firstName();
		lastName();
		email();
		phoneNumber();
		password();
		scanner.close();
	}
	
	public static void firstName() {
		System.out.println("Enter the first name");
		String value = scanner.next();
		System.out.println(Pattern.matches(FIRST_NAME_REGEX, value));
	}
	
	public static void lastName() {
		System.out.println("Enter the last name");
		String value = scanner.next();
		System.out.println(Pattern.matches(LAST_NAME_REGEX, value));
	}
	
	public static void email() {
		System.out.println("Enter the Email Address");
		String value = scanner.next();
		System.out.println(Pattern.matches(EMAIL_ID_REGEX, value));
	}
	
	public static void phoneNumber() {
		System.out.println("Enter the Phone Number");
		String value = scanner.next();
		System.out.println(Pattern.matches(MOBILE_NUMBER_REGEX, value));
	}
	
	public static void password() {
		System.out.println("Enter the password");
		String value = scanner.next();
		System.out.println(Pattern.matches(PASSWORD_REGEX, value));
	}

}
