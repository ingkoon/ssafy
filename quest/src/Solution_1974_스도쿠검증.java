import java.util.Scanner;

public class Solution_1974_스도쿠검증 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int SIZE = 9;
        int SUM = 45;

        for (int t = 1; t <= T; t++) {

            int[][] sudoku = new int[SIZE][SIZE];
            int result = 1;

            // 스도쿠 입력
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    sudoku[i][j] = sc.nextInt();
                }
            }

            // 행열 검사
            for (int i = 0; i < SIZE; i++) {
                int checkCol = 0;
                int checkRow = 0;
                for (int j = 0; j < SIZE; j++) {
                    checkRow += sudoku[i][j];
                    checkCol += sudoku[j][i];
                }

                if(checkCol != SUM || checkRow != SUM) {
                    result = 0;
                }
            }


            // 3*3 칸 검사
            for (int i = 0; i < 6; i+=3) {
                for (int j = 0; j < 6; j+=3) {
                    int checkSum = 0;
                    int r = i+3;
                    int c = j+3;
                    for (int k = i; k < r; k++) {
                        for (int l = j; l < c; l++) {
                            checkSum += sudoku[k][l];
                        }
                    }
                    if(checkSum != SUM) {
                        result = 0;
                        break;
                    }
                }
            }

            System.out.printf("#%d %d%n", t, result);
        }
    }
}
