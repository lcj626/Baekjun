package com.ohgiraffers.baekjun.n2903;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("거칠 과정의 횟수를 입력해 주세요");
        int N = scanner.nextInt();

        int answer = 2;

        for (int i = 0; i < N; i++) {
            answer = (answer-1) + answer;
        }
        System.out.println(answer*answer);
    }
}
