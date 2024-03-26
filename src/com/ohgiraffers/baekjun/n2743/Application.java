package com.ohgiraffers.baekjun.n2743;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){


        String a = "110011";

        String b = "100";

        System.out.println("2진수 -> 10진수");
        System.out.println(Integer.parseInt(a,2));

        System.out.println("16진수 -> 10진수");
        System.out.println(Integer.parseInt(a,16));

        System.out.println();

        System.out.println("===============================");

        for (int i = 2; i <= 36; i++) {
            String s = Integer.toString(100,i);
            System.out.println("i " + i + " = " + s);
        }
        // 10진법 수를 각자 2~36진법으로 바꿨을 때 값 도출



        Scanner scanner = new Scanner(System.in);


    }
}
