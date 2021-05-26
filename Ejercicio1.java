package com.company;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, c = 0;

        System.out.println("Ingresa el número para calcular:");
        m = sc.nextInt();

        for(int i = 0; c < m; i++){
            if ( i % 2 == 0){
                System.out.println(i);
                c++;
            }
        }
    }
}

