import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter desired password length: ");
        int length = scanner.nextInt();

        if (length < 4) {
            System.out.println("Password should be at least 4 characters long.");
            return;
        }

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String symbols = "!@#$%^&*()-_=+[]{};:<>?/|";

        String allChars = upper + lower + digits + symbols;
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        // Ensure at least one from each type
        password.append(upper.charAt(random.nextInt(upper.length())));
        password.append(lower.charAt(random.nextInt(lower.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));
        password.append(symbols.charAt(random.nextInt(symbols.length())));

        // Fill remaining characters randomly
        for (int i = 4; i < length; i++) {
            password.append(allChars.charAt(random.nextInt(allChars.length())));
        }

        // Shuffle the characters
        char[] pwdArray = password.toString().toCharArray();
        for (int i = 0; i < pwdArray.length; i++) {
            int j = random.nextInt(pwdArray.length);
            // swap
            char temp = pwdArray[i];
            pwdArray[i] = pwdArray[j];
            pwdArray[j] = temp;
        }

        System.out.println("Generated Password: " + new String(pwdArray));
        scanner.close();
    }
}
basic ga chuskodaniki code pai paina