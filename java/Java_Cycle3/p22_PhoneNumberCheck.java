import java.util.Scanner;

public class p22_PhoneNumberCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a phone number: ");
        String phoneNumber = scanner.nextLine();

        try {
            checkPhoneNumber(phoneNumber);
            System.out.println("Phone number is valid!");
        } catch (InvalidPhoneNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    public static void checkPhoneNumber(String number) throws InvalidPhoneNumberException {
        if (number.length() != 10 || !number.matches("\\d{10}")) {
            throw new InvalidPhoneNumberException("Phone number must have exactly 10 digits.");
        }
    }
}

// Custom exception class
class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}
