package edu.gabriel.primeirasemana;

public class BoletimEscolar {
    public static void main(String[] args){
        short nota = 7;
        
        if (nota > 6) {
            System.out.println("Aprovado!");
        } else if (nota == 6){
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado..");
        }
    }
}
