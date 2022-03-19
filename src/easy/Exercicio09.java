package easy;

import javax.swing.JOptionPane;

public class Exercicio09 {

    public static void main(String[] args) {
        int numeroDigitado, i = 1;

        String numeroDigitadoStg = JOptionPane.showInputDialog("Digite um numero para calcular a tabuada");
        numeroDigitado = Integer.parseInt(numeroDigitadoStg);

        while (i <= 10) {
            System.out.println(numeroDigitado * i);
            i++;
        }
    }

}
