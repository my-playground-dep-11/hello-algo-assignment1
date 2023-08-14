import java.util.Scanner;

public class Algo9 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String inputWord;
    
        do{
            System.out.print("Enter a single word: ");
            inputWord = scanner.nextLine().trim();
            if(inputWord.isEmpty()){
                System.out.println("Invalid input! Please enter a single word.");
            }
        
        }while(inputWord.isEmpty());

        String cleanedWord = inputWord.toLowerCase();
        int length = cleanedWord.length();
        boolean isPalindrome = true;

        for (int i = 0; i < length / 2; i++) {
            if (cleanedWord.charAt(i) != cleanedWord.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("'" + inputWord + "' is a palindrome.");
        } else {
            System.out.println("'" + inputWord + "' is not a palindrome.");
        }

        }

        

            
    }
    

