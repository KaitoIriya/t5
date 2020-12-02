package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Разложение на множители:");
        Decompos decomposition = new Decompos();
        decomposition.dec(150, 2);

        System.out.println();
        System.out.println("Палиндром:");

        Palindrome pal = new Palindrome();
        if (pal.palindrome("abraarba") == true){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }


        System.out.println("Без двух нулей:");

        AandB ab = new AandB();
        System.out.println(ab.aandb(3, 3));
    }
}
