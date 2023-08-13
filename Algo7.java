import java.util.Scanner;

public class Algo7 {
    private final static Scanner scanner = new Scanner(System.in);

    

    public static void main(String[] args) {
        

        System.out.print("Please enter a sentence: ");
        String sentence = scanner.nextLine().trim();

        if (!sentence.isEmpty()) {
            String[] words = sentence.split("\\s+");
            String shortestWord = words[1];
            String longestWord = words[1];
            String word = "";
            String str = "";
            //int count = 0;
            

            for (int i = 0; i < words.length-1; i++ ) {
                word = words[i];
                str = words[i];

                if (word.length() < shortestWord.length()) {
                    if(word.length() < shortestWord.length()){
                        shortestWord = word;
                    }else if (word.length() == shortestWord.length()){    
                        shortestWord = word + "," + shortestWord;
    
                    }
                        
                }
                if (str.length() > longestWord.length()){
                    if(str.length() > longestWord.length()){
                        longestWord = str;
                    }else if(str.length() == longestWord.length()){
                         longestWord = str + "," + longestWord;
                    }
                    

                }
            }

            System.out.println("Shortest word: " + shortestWord + " (length: " + word.length() + ")");
            System.out.println("Longest word: " + longestWord + " (length: " + longestWord.length() + ")");
        } else {
            System.out.println("Input is empty. Please provide a sentence.");
        }

        scanner.close();
    }
}



    

