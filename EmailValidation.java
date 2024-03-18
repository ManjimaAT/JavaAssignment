package org.example;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
    public static boolean validateEmail(String email) {
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }
    public static void main(String[] args) {
        String email = "manjima@example.com";
        if (validateEmail(email)) {
            System.out.println("Email is valid.");
        } else {
            System.out.println("Email is not valid.");
        }
    }
}
