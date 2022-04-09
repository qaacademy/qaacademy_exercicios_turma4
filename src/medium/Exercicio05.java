package medium;

import javax.swing.JOptionPane;

public class Exercicio05 {

    public int verificaMenorValor(int[] vetorNumeros) {
        int i = 1, menor = 0, numeroDigitado;
        while (i <= 5) {
            numeroDigitado = vetorNumeros[i - 1];
            if (numeroDigitado < menor || i == 1) {
                menor = numeroDigitado;
            }
            i++;
        }
        return menor;
    }

}