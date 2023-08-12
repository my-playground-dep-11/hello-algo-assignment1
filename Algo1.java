import java.util.Scanner;

public class Algo1{
    private final static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int currentNum = 0;
        int nextNum = 1;
        int i = 1;    
        int number;    

        do{
            System.out.print("Enter your number: ");
            number = scanner.nextInt();
            scanner.nextLine();
            if (number < 1){
                System.out.println("Enter a positive number!");
                
            }
            
        }while(number < 1);
    
        do{
            
            int sum = currentNum + nextNum;
            System.out.print(currentNum+" "); 
            currentNum = nextNum;
            nextNum = sum;
            i++;    

        }while( i-1 <= number);
        System.out.println();    
        
    }

}