package com.company;//EJ2
import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;

        System.out.println("Ingresa el número para calcular sus múltiplos:");
        m = sc.nextInt();
        System.out.println("Ingresa la cantidad de múltiplos a calcular:");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println(m*i);
        }
    }
}


