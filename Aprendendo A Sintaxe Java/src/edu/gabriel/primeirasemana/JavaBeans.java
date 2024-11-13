package edu.gabriel.primeirasemana;

public class JavaBeans {
    public static void main(String[] args) {
        /* Variáveis sempre no singular, menos em Arrays e Coleções;
         * Lembre-se de sempre se manter a uma linguagem pt-br, eng
         * Exemplo de variáveis escritas corretamente:
         */
        String email = "contato.joaogabriel@proton.me";
        String [] emails = {
            "md5cryptnet@gmail.com",
            "contato.joaogabriel@proton.me",
        };
        long pontuacaoPrimeiraProva = 8;
        
        for (String _email: emails) {
            System.out.println(_email); 
        };


    }
}
