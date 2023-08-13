public class Algo8_3 {
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};
        System.out.print("{");
        for (int num : numA) {
            boolean isPresentInNumB = false;

            for (int b : numB) {
                if (num == b) {
                    isPresentInNumB = true;
                    break;
                }
            }

            if (!isPresentInNumB) {
                System.out.print(num+ ",");
            }
        }
        System.out.println("\b}");
    }
    
}
