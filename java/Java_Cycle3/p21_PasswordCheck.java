import java.util.Scanner;

class PasswordValidator {
    String password;

    // Constructor to initialize password
    PasswordValidator(String password) {
        this.password = password;
    }

    // Method to validate password
    void validatePassword() throws Exception {
        int length = password.length();
        int numberCount = 0;
        int specialCharCount = 0;

        // Check password length
        if (length < 8) {
            throw new Exception("Password must be at least 8 characters long.");
        }

        // Loop through each character in the password
        for (int i = 0; i < length; i++) {
            char ch = password.charAt(i);

            // Check if character is a number (0-9)
            if (ch >= '0' && ch <= '9') {
                numberCount++;
            }

            // Check if character is a special character ($, #, &, ))
            if (ch == '$' || ch == '#' || ch == '&' || ch == ')') {
                specialCharCount++;
            }
        }

        // Validate number and special character conditions
        if (numberCount == 0) {
            throw new Exception("Password must contain at least one number.");
        }
        if (specialCharCount == 0) {
            throw new Exception("Password must contain at least one special character ($, #, &, )).");
        }
    }
}

public class p21_PasswordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String inputPassword = scanner.nextLine();

        // Create an object of PasswordValidator
        PasswordValidator validator = new PasswordValidator(inputPassword);

        try {
            validator.validatePassword();
            System.out.println("Password is valid!");
        } catch (Exception e) {
            System.out.println("Invalid Password: " + e.getMessage());
        }

        scanner.close();
    }
}
