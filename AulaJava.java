
package com.mycompany.aula.java;

public class AulaJava {
    public static void main(String[] args) {
        String [][] nomes = {
            {"EMPUNHADURA", "SUPRESSOR", "PESTE", "FOME"},
            {"DEGRADE", "SAPATO", "TERRA", "COMIDA"},
            {"GAIVOTA", "URSO", "LOBO", "CAVALO"},
            {"ANA","PAULO","CARLOS","KAROL"},
            {"COISA","LOUCO","MALUCO","DOIDO"}
        };


        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Linha " + (i + 1) + ": ");
            for (int j = 0; j < nomes[i].length; j++) {
                System.out.print(nomes[i][j] + "\t");
            }
            System.out.println(nomes);
            
        }
    }
}