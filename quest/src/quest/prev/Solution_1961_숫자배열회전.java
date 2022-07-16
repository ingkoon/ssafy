package quest.prev;

import java.util.Scanner;

public class Solution_1961_숫자배열회전 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();

            int[][] arr = new int[n][n];

            // 입력
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            // 90도 회전하였을 경우
            for (int i = 0; i < n; i++) {
                for (int j = n-1; j >= 0; j--) {
                    System.out.println(" 90 = " + arr[j][i]);
                }
            }

            // 180도 회전하였을 경우
            for (int i = n-1; i >= 0; i--) {
                for (int j = n-1; j >=0 ; j--) {
                    System.out.println("180 = " + arr[i][j]);
                }
            }

            // 270도 회전하였을 경우
            for (int i = n-1; i >= 0; i--) {
                for (int j = 0; j < n; j++) {
                    System.out.println("arr[j][i] = " + arr[j][i]);
                }
            }

        }
    }
}
