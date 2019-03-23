package poo;

public class Batedeira {

    //atributos da classe
    private int pa;
    private int botaoVelocidade;
    private int pote;

    //metodos

    public void ColocarPa(int Pa) {
        this.pa = Pa;

        if (pa == 1) {
            System.out.println("Colocando a pá");
        } else if (pa == 2) {
            System.out.println("Retirando a pá");
        } else {
            System.out.println("Opção errada");
        }
    }

    public void alterarVelocidade(int Velocidade) {
        this.botaoVelocidade = Velocidade;

        if (botaoVelocidade == 1) {
            System.out.println("Aumentado a velocidade");
        } else if (botaoVelocidade == 2) {
            System.out.println("Diminuindo a velocidade");
        } else {
            System.out.println("Opção errada");
        }
    }

    public void alterarEstadoPote(int Pote) {
        this.pote = Pote;

        if (pote == 1) {
            System.out.println("Enchendo o pote");
        } else if (pote == 2) {
            System.out.println("Esvaziando o pote");
        } else {
            System.out.println("Opção errada");
        }


    }

}