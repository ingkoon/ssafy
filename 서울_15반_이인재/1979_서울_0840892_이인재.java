import java.util.Scanner;

public class Solution_1979_어디에단어가들어갈수있을까 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            
            int n = sc.nextInt();
            int k = sc.nextInt();
            int result = 0;
            int[][] arr = new int[n][n];


            /*
            * 배열 입력
            */
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                   arr[i][j] = sc.nextInt();
                }
            }


            /*
            * check col
            */
            for (int i = 0; i < n; i++) {
                int cnt = 0;
                for (int j = 0; j < n; j++) {
                    if(arr[i][j] == 0) {
                        if(cnt == k)
                            result++;
                        cnt = 0;
                    }
                    else{
                        cnt++;
                    }
                }
                if(cnt == k){
                    result++;
                }
            }

            /*
            * check row
            */
            for (int i = 0; i < n; i++) {
                int cnt = 0;
                for (int j = 0; j < n; j++) {
                    if(arr[j][i] == 0) {
                        if(cnt == k)
                            result++;
                        cnt = 0;
                    }
                    else{
                        cnt++;
                    }
                }
                if(cnt == k){
                    result++;
                }
            }

            System.out.printf("#%d %d%n",t, result);
        }
    }
}
