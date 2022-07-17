import java.util.Scanner;

public class Solution_1979_어디에단어가들어갈수있을까 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[][] arr = new int[n+2][n+2];

            /*
            * 배열 입력
            */
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                   arr[i][j] = sc.nextInt();
                }
            }


        }
    }
}
