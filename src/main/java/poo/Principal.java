package poo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Batedeira bat = new Batedeira();
        int opcao = 0;


        do {
            System.out.println("Digite:");
            System.out.println("1:Mexer pá:");
            System.out.println("2:Alterar a velocidade");
            System.out.println("3:Encher ou Esvaziar o pote da batedeira:");
            System.out.println("4:Para sair:");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite:");
                    System.out.println("1:Para colocar a pá:");
                    System.out.println("2:Para retirar a pá:");
                    bat.ColocarPa(teclado.nextInt());
                    break;

                case 2:
                    System.out.println("Digite:");
                    System.out.println("1:Para aumentar a velocidade:");
                    System.out.println("2:Para diminuir a velocidade:");
                    bat.alterarVelocidade(teclado.nextInt());
                    break;

                case 3:
                    System.out.println("Digite:");
                    System.out.println("1:Para encher o pote:");
                    System.out.println("2:Para esvaziar o pote:");
                    bat.alterarEstadoPote(teclado.nextInt());
                    break;

                default:
                    break;

            }

        } while (opcao != 4);
        System.out.println("Você saiu:");
    }

}