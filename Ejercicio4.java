package com.company;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            int contador = 0;
            for (int j = 1; j <= i; j++) {
                if(i%j==0) {
                    contador++;
                }
            }
            if(contador <= 2){
                System.out.println(i);
            }
        }
    }

}
