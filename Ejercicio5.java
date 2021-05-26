package com.company;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, d, cont =0, numAux = 0, num = 1, contadorDigitos;

        System.out.println("Ingresa los valores para n, m y d:");
        n=sc.nextInt();
        m=sc.nextInt();
        d=sc.nextInt();

        while (cont < n){
            numAux = num;
            contadorDigitos = 0;

            while(numAux > 0){
                if(numAux%10 == d){
                    contadorDigitos++;
                }
                numAux/=10;
            }

            if(contadorDigitos >= m){
                System.out.println(num);
                cont++;
            }
            num++;
        }
    }
}

