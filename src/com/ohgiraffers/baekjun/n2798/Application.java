package com.ohgiraffers.baekjun.n2798;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        // N장의 카드 중 임의로 뽑은 3개가 <= M 이면서 M에 최대한 가깝게
        // 3<=N<=100  10<=M<=10000




        Scanner scanner = new Scanner(System.in);

        System.out.println(" 몇 장의 카드를 뿌릴 건지 입력하시오 ");
        int N = scanner.nextInt();
        System.out.println(" 선정할 숫자를 입력하시오 ");
        int M = scanner.nextInt();
        System.out.println(" 뿌린 카드의 숫자들을 입력하시오");
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = scanner.nextInt();
        }

        if(N<3){
            System.out.println("3개 이상의 수를 입력해 주세요");
        }else{
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    for (int k = 0; k < N; k++) {
                        System.out.println(num[i] + num[j] + num[k]);
                    }

                }

            }
        }


    }
}
