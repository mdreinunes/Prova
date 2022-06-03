package Ex6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nCasos;
        String NAlien;
        String linguagemOrigem;
        String linguagemAlvo;
        String resultado = "";

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero de casos: ");
        nCasos = scan.nextInt();

        for (int c = 0; c < nCasos; c++) {
            double soma = 0;
            int p = 0;

            System.out.println("Numero alienigena");
            NAlien = scan.next();

            System.out.println("Linguagem de origem");
            linguagemOrigem = scan.next();

            System.out.println("Linguagem alvo");
            linguagemAlvo = scan.next();

            for (int i = NAlien.length(); i > 0; i--) {
                int NlinguagemOrigem = linguagemOrigem.indexOf(NAlien.charAt(i - 1));
                double pow = Math.pow(linguagemOrigem.length(), p);
                double numero = pow * NlinguagemOrigem;
                soma = soma + numero;
                p++;
            }

            resultado = resultado + "\n";

            while (soma >= 1) {
                double resto = soma % linguagemAlvo.length();
                soma = soma / linguagemAlvo.length();
                Character ch = linguagemAlvo.charAt((int) resto);
                resultado = resultado + ch.toString();
            }
        }

        for (int i = resultado.length(); i > 0; i--) {
            System.out.print(resultado.charAt(i - 1));
        }
    }
}


