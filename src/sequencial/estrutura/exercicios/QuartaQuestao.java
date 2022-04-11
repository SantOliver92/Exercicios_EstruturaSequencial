package sequencial.estrutura.exercicios;

import java.util.Scanner;

public class QuartaQuestao {

    public static void questao04() {

        Scanner scan = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, media;

        System.out.println("Digite as respectivas notas!");
        System.out.println("Bimestre 1: ");
        nota1 = scan.nextDouble();
        System.out.println("Bimestre 2: ");
        nota2 = scan.nextDouble();
        System.out.println("Bimestre 3: ");
        nota3 = scan.nextDouble();
        System.out.println("Bimestre 4: ");
        nota4 = scan.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A sua média é de: " + media);

    }

}
