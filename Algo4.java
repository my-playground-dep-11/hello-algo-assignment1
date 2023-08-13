public class Algo4 {
    public static void main(String[] args) {
        int nums[] = {10, 20, 30, 40, 50};
        System.out.print("[");
            
        for (int j = nums.length-1; j >= 0;j--) {
            System.out.print(nums[j] + ",");           
        }
        System.out.println("\b]");        
    }
    
}
