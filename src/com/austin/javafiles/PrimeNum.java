package com.austin.javafiles;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean flag = true;
        for(int i = 2;i<x;i++){
            if(x%i == 0){
                System.out.println("Not prime");
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Prime");
        }
    }
}
