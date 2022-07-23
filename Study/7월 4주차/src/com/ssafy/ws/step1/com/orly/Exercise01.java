package com.ssafy.ws.step1.com.orly;

/*
* 두 수를 입력받아 더 큰 수를 출력하시오
* */
public class Exercise01 {


    public static void main(String[] args) {
        Exercise01 exercise01 = new Exercise01();

        System.out.println("exercise01 = " + exercise01.compare(10, 20));
    }

    public int compare(int n, int m){
        return (n > m) ? n : m;
    }
}
