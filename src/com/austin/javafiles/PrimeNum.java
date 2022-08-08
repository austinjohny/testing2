package com.austin.javafiles;

import java.util.Scanner;

public class PrimeNum {

    public static int[] primeRange(int n){
        int[] arr = new int[n];
        int count = 0;
        for(int i = 1;i<=n;i++){
            boolean flag = true;
            for(int j = 2;j<i;j++){
                if(i%j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
               arr[count++] = i;
            }
        }
        return arr;
    }

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
        System.out.print("Enter the number till you want prime numbers: ");
        int n = sc.nextInt();
        int[] prime = primeRange(n);
        for(int i:prime){
            if(i!=0){
            System.out.println(i);}
        }
    }
}
