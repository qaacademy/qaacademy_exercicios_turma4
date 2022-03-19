package easy;

import javax.swing.JOptionPane;

public class Exercicio04 {

    public static void main(String[] args) {

        String numeroDigitadoString = JOptionPane.showInputDialog("Digite o número que voce deseja calcular o dobro");
        int numero = Integer.parseInt(numeroDigitadoString);
        System.out.println("O dobro do numero " + numero + " é: " + numero * 2);
    }
}
