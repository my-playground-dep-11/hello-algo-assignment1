import java.util.Scanner;

public class Algo10 {
    private final static Scanner scanner = new Scanner(System.in);
    

    public static void main(String[] args) {
        

        String input;

        do {
            System.out.print("Please enter a phone number: ");
            input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Telephone number can't be empty. Please enter a phone number.");
            }
        } while (input.isEmpty());

        boolean isValid = false;
        String[] parts = input.split(" ");
        if (parts.length == 4 && parts[0].startsWith("+94") && parts[1].length() == 2 &&
            parts[2].length() == 3 && parts[3].length() == 4) {

            boolean areAllPartsDigits = false;
            for (String part : parts) {
                for (int i = 0; i < part.length(); i++) {
                    if (Character.isDigit(part.charAt(i))) {
                        areAllPartsDigits = true;
                        
                    }
                }
                
            }

            if (areAllPartsDigits) {
                isValid = true;
            }

        }
        String[] parts1 = input.split("-");
        if (parts1.length == 2 && parts1[0].length() == 3 && parts1[1].length() == 7) {
            
            boolean areAllPartsDigits = true;
            for (String part : parts1) {
                for (int i = 0; i < part.length(); i++) {
                    if (!Character.isDigit(part.charAt(i))) {
                        areAllPartsDigits = false;
                        break;
                    }
                }
                if (!areAllPartsDigits) {
                    break;
                }
            }

            if (areAllPartsDigits) {
                isValid = true;
            }
        }

        if (isValid) {
            System.out.println("Number is validated.");
        } else {
            System.out.println("Invalid phone number.");
        }

    
    }
}


    

