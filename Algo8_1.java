public class Algo8_1 {
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};
        String str = "";
        System.out.print("{");

        for (int i = 0; i < numA.length; i++) {
            for (int j = 0; j < numB.length; j++) {
                if(numA[i] == numB[j]){
                    str += numA[i]+ ",";
                }
                
            }
            
        }
        System.out.println(str+"\b}");
    }
    
}
