public class Q5 {
    public static void afficherTriangle(int N) {
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        afficherTriangle(N);
    }
}