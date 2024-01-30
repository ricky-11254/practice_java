import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int T;
        T = input.nextInt();
        while (T-- > 0) {
            int N;
            N = input.nextInt();
            int sum = 0;
            for (int i = 0; i < N; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    sum += i;
                }
            }
            System.out.println(sum);
        }
    }
}
