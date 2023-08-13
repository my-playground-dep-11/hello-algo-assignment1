import java.util.Arrays;

public class Algo3 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        //System.out.print("[");
        int[] newArray = new int[5];
        for (int i = nums.length-1, j = 0; i >= 0; i--, j++){
            newArray[j] = nums[i];
        

            //System.out.print(newArray+ ",");            
        }
        //System.out.println("\b"+"]");
        nums = newArray;
        String str = "[";

        for (int i = 0; i < nums.length; i++) {
            str += nums[i]+ ",";
            
        }
        System.out.println(str +"\b]" );

        

        // String finalOutput = "";
        // for (int i = 0; i >= newArray.length-1; i++ ){
        //     finalOutput = newArray[i];
        //     System.out.println();
        }

        
        
    }
    

