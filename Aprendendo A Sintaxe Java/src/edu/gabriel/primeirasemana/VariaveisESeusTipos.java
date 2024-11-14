package edu.gabriel.primeirasemana;

public class VariaveisESeusTipos {
    public static void main(String[] args) {
        // De modo simples, os tipos primitivos não são considerados objetos, e são armazenados na memory stack.
        // byte, short, int, long, float, double;
        final String INSTITUICAO = "UNIMA | Afya";
        byte [] notas = {95, 20};

        for (byte nota: notas){
            System.out.println(nota);
        } 
    }
}
