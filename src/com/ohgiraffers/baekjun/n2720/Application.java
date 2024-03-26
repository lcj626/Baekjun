package com.ohgiraffers.baekjun.n2720;


import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("거스름돈 액수를 입력해 주세요");
        int C = scanner.nextInt();

        for (int d = 0; d < C; d++) {
            for (int c = 0; c < C/5; c++) {
                for (int b = 0; b < C/10; b++) {
                    for(int a = 0; a < C/25; a++){
                        if(25*a+10*b+5*c+d == C){
                            System.out.println("a : " + a + " b : " + b + " c : " + c + " d : " +d);
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}
