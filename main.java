import java.util.Scanner;

public class main {
    static int calc(int[]maxVal, int[]minVal){
        int result= 0;
        for(int i = 0; i< maxVal.length - minVal.length + 1; i++){
            int sum = 0;
            for(int j = 0; j < minVal.length; j ++){
                sum += minVal[j] * maxVal[i+j];
            }
            result = Math.max(sum, result);
        }
        return result;
    }


    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int c = 0; c < t; c++){
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[m];

            for(int i = 0; i< n; i++) a[i] = sc.nextInt();
            for(int i = 0; i< m; i++) b[i] = sc.nextInt();

            int result = (n > m) ? calc(a, b) : calc(b, a);
            System.out.println("#"+ (c+1) + " " +result);
        }
    }
}
