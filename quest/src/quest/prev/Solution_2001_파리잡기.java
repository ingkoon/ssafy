package quest.prev;


import java.util.Scanner;

public class Solution_2001_파리잡기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 1; t<= T; t++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][n];

            int result = 0;

            for(int i = 0; i< n; i++){
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < n-m+1; i++) {
                for (int j = 0; j < n-m+1; j++) {
                    int sum = 0;
                    for (int k = i; k < i+m; k++) {
                        for (int l = j; l < j+m; l++) {
                            sum += arr[k][l];
                        }
                    }
                    result = Math.max(result, sum);
                }
            }

            System.out.printf("#%d %d", t, result);
            System.out.println();
        }
    }
}
