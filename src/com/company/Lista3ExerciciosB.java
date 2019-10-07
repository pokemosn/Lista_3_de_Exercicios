package com.company;

import java.util.Scanner;

public class Lista3ExerciciosB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int idade;
                int maior,menor;
        System.out.println("numerode pacientes" );
        numero = sc.nextInt();
        System.out.println("idade do paciente");
        idade = sc.nextInt();

        for(int i = 0; i <= numero; ++i) {
            System.out.println("numero de pacientes" +i);
            if (maior > menor) {
                System.out.println("idade do mais velho"+ maior);
            }



        }
    }
}
