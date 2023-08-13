import java.util.Scanner;

public class Algo6 {
     private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String text = "";
            
        
        loop:
        do{
            
            String c = "";
        
            System.out.print("Enter your input: ");
            text = scanner.nextLine();

            char[] chars = text.toCharArray();
            String[] srt = text.split(" ");

            int j = srt.length-1;
            if (text.isBlank()){
                System.out.println("Text is Empty, Enter the text again!");
                continue loop;
            }
            for (int i = 0; i <= srt.length-1; i++, j--){
                int x = chars[i];
                
                
                    if (x<0 || 128<=x ){
                        System.out.println("Enter a valid ASCII character!");
                        continue loop;
                    }else {
                        c += srt[j]+ " ";
                    }
            
                }
                System.out.println(c);
                break;
                
    
    
            }while(true);
                        
        
    }
    
}
