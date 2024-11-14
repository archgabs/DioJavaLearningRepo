package edu.gabriel.primeirasemana;


public class Operadores {
    public static void main(String[] args) {
        String primeiroTeste = validacaoInputNome("Gabriel");
        String segundoTeste = validacaoInputNome(" ");
        String terceiroTeste = validacaoInputNome("");

        System.out.println(primeiroTeste);
        System.out.println(segundoTeste);
        System.out.println(terceiroTeste);
    }

    public static double gerarMediaNotas(double [] notas) {
        double media = 0;

        for(int index = 0; index < notas.length; index++){
            System.out.println("Adicionando nota...");
            media += notas[index];
        };

        return media /= notas.length;
    } 

    public static String validacaoInputNome(String nome){
        return !nome.isBlank() ? nome : "Anônimo";
    }
    
}
