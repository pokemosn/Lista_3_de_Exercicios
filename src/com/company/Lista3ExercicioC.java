package com.company;

import java.util.Scanner;

public class Lista3ExercicioC {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double total,cap,jur,mes;
        System.out.println("capital:");
        cap = sc.nextDouble();
        System.out.println("taxa:");
        jur = sc.nextDouble();
        System.out.println("mês:");
        mes = sc.nextDouble();
        for(int i = 0; i <= 3; ++i) {
            System.out.println(i);
        total = cap * jur * mes;
        System.out.println( "O valor tota este mês é:" + total );
     }
}}
