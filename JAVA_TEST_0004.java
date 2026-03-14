public class JAVA_TEST_0004 {
    public static void main(String[] args) {
        int n = 4;
        int size = 2 * n - 1;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                int minDistance = Math.min(Math.min(i - 1, size - i), Math.min(j - 1, size - j));
                
                System.out.print(n - minDistance);
                
                if (j < size) {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
}
// Final submission