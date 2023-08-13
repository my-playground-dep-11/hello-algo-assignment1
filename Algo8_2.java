public class Algo8_2 {
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
        System.out.print(str+ " ");

        for (int num : numA) {
            boolean isPresentInNumB = false;

            for (int b : numB) {
                if (num == b) {
                    isPresentInNumB = true;
                    break;
                }
            }

            if (!isPresentInNumB) {
                System.out.print(num + ",");
            }
        }

        for (int num : numB) {
            boolean isPresentInNumA = false;

            for (int a : numA) {
                if (num == a) {
                    isPresentInNumA = true;
                    break;
                }
            }

            if (!isPresentInNumA) {
                System.out.print(num+ ",");
            }
        }
        System.out.println("\b}");
    }
    
}
