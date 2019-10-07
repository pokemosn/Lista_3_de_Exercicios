package com.company;

import java.util.Scanner;

public class Lista3ExerciciosD<candidatoUm, candidatoDois> {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sair = 1;
        int g = 0;
        int s = 0;
        int p = 0;
        int z = 0;
        int b = 0;
        int n = 0;

        while (sair != 0){
            System.out.println ("Qual é o seu Candidato?");
            int voto = input.nextInt();

            if(voto == 1){
                System.out.println ("Candidato Garrincha");
                System.out.println("");
                g = g+1;
            }

            if(voto == 2){
                System.out.println ("Candidato Sócrates");
                System.out.println("");
                s = s+1;
            }

            if(voto == 3){
                System.out.println ("Candidato Zico ");
                System.out.println("");
                z = z+1;
            }
            if(voto == 4){
                System.out.println ("Candidato Pele");
                System.out.println("");
                p = p+1;
            }

            if(voto == 5){
                System.out.println ("Voto em Branco");
                System.out.println("");
                b = b+1;
            }
            if(voto > 5 ){
                System.out.println ("Voto Nulo");
                System.out.println("");
                n = n+1;
            }

            if(voto == 0){
                sair = voto;
                int vtotal = p+z+s+g+b+n;
                System.out.println("Contagem dos votos:");
                System.out.println("Total dos votos: " + vtotal);
                System.out.println("Pelé: " + p);
                System.out.println("Garrincha: " + g);
                System.out.println("Zico: " + z);
                System.out.println("Sócrates: " + s);
                System.out.println("Brancos: " + b);
                System.out.println("Nulos: " + n);

                break;
            }
        }
    }
}       }