package com.company;//EJ3
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args){

        System.out.println("Ingrese valor: ");

        int n;
        Scanner entrada = new Scanner(System.in);

        n = entrada.nextInt();

        int cont =0;

        for(int i=1; i<=n; i++){
            if(n%i==0) {
                cont++;
            }
        }

        if(cont<=2 && n!=1) {
            System.out.println("Es primo");
        }else System.out.println("No es primo");
    }
}

