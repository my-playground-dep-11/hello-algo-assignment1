public class Algo8_4 {
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};
        System.out.print("{");
        for (int num : numB) {
            boolean isPresentInNumA = false;

            for (int b : numA) {
                if (num == b) {
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
