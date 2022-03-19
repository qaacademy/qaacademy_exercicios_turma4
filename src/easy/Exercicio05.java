package easy;

import javax.swing.JOptionPane;

public class Exercicio05 {

    public static void main(String[] args) {

        double numero1, numero2, numero3;
        double soma, subtracao, multiplicacao,media;

        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
        numero3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número"));

        soma = numero1 + numero2 + numero3;
        subtracao = numero1 - numero2 - numero3;
        multiplicacao = numero1 * numero2 * numero3;
        media = (numero1 + numero2 + numero3) / 3;

        System.out.println("A soma dos números digitados é: " + soma);
        System.out.println("A subtração dos números digitados é: " + subtracao);
        System.out.println("A soma dos multiplicacao digitados é: " + multiplicacao);
        System.out.println("A soma dos media digitados é: " + media);

    }

}
