package com.ssafy.ws.step1;

import java.util.Scanner;

public class EvenSum {

    public static void main(String[] args) {
        EvenSum evenSum = new EvenSum();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(evenSum.calc(n));
    }

    private int calc(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(i%2 == 0) sum += i;
        }
        return sum;
    }
}
