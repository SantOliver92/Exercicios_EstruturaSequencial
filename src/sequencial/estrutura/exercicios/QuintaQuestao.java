package sequencial.estrutura.exercicios;

import java.util.Scanner;

public class QuintaQuestao {

    public static void questao05() {

        Scanner scan = new Scanner(System.in);
        double metro, centimetro;

        System.out.println("Bem vindo ao conversor de metros para centímetros!");
        System.out.println("Digite o valor que você deseja converter:");
        metro = scan.nextDouble();

        centimetro = metro * 100;

        System.out.println(metro + " m = " + centimetro + " cm");

    }


}
