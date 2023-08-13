import java.util.Scanner;

public class Algo5 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String text;
        
        do{
            System.out.print("Enter your input: ");
            text = scanner.nextLine();
            if (text.isBlank()){
                System.out.println("Text is Empty, Enter the text again!");
            }

        }while(text.isBlank());
        char[] chars = text.toCharArray();
        int j = chars.length-1;
         
        do{
            for (int i = 0; i <= chars.length-1; i++, j--){
            char c = chars[i];
            //char x = chars[j];
            //if(c == ' ' || x == ' ') continue; //By considering a space(' ') is also an ASCII character.
            c = chars[j];
            System.out.print(c);

            }
            System.out.println();
        }while(j>0);

        }


        

        
    }
    

