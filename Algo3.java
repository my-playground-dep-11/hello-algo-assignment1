public class Algo3 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int[] newArray = new int[5];
        for (int i = nums.length-1, j = 0; i >= 0; i--, j++){
            newArray[j] = nums[i];
                        
        }
        nums = newArray;
        String str = "[";

        for (int i = 0; i < nums.length; i++) {
            str += nums[i]+ ",";
            
        }
        System.out.println(str +"\b]" );
        }        
        
    }
    

