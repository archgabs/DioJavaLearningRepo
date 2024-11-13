package edu.gabriel.primeirasemana;

public class App {
    public static void main(String[] args) throws Exception {
        String meuNome = "João Gabriel";
        String cpfString = "14458086413";

        String greet = greeter(meuNome, cpfString);
        System.out.println(greet);
    }
    
    public static String greeter(String nome, String cpf){
        return "Bem-vindo ao aplicativo, " + nome + ".\nCPF: " + cpf + ".";
    }
}
