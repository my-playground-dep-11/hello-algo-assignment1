import java.util.Scanner;

public class Algo5 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String text = "";
            
        
        loop:
        do{
            
            String c = "";
        
            System.out.print("Enter your input: ");
            text = scanner.nextLine();
            char[] chars = text.toCharArray();
            int j = chars.length-1;
            if (text.isBlank()){
                System.out.println("Text is Empty, Enter the text again!");
                continue loop;
            }

            for (int i = 0; i <= chars.length-1; i++, j--){
            int x = chars[i];
            
            
                if (x<0 || 128<=x ){
                    System.out.println("Enter a valid ASCII character!");
                    continue loop;
                }else {
                    c += chars[j];
                    
                
                }
            
            }
            System.out.println(c);
            break;
            


        }while(true);
        
        
        // loop: 
        // do{
            
        // }while(j>0);

        // }
        }
    }


        

    
    
    

