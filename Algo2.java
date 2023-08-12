public class Algo2 {
    public static void main(String[] args) {
        int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23};

        for (int i = 0; i < nums.length-1; i++){
            int largestNum;
            int smallestNum;
            if(nums[i]>= nums[i+1]){
                largestNum = nums[i];
                smallestNum = nums[i+1];
                System.out.println("Largest number in the set: "+ largestNum);
                System.out.println("Smallest number in the set: "+ smallestNum);
                

            }
        }
    }
    
}
