import java.util.Scanner;

public class Solution_1961_숫자배열회전 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            System.out.printf("#%d%n",t);

            int n = sc.nextInt();

            int[][] arr = new int[n][n];

            // 입력
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            // 90, 180, 270에 대한 결과를 각각 출력
            for (int i = 0; i < n; i++) {
                int a = n -1 - i;
                for (int j = n-1; j >= 0; j--) {
                    System.out.print(arr[j][i]);
                }
                System.out.print(" ");
                for (int j = n-1; j >=0 ; j--) {
                    System.out.print(arr[a][j]);
                }
                System.out.print(" ");
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[j][a]);
                }
                System.out.println();
            }
        }
    }
}
