package easy;

import javax.swing.JOptionPane;

public class Exercicio09 {

    public int[] calcularTabuada(int numeroDigitado) {

        int[] vetorTabuada = new int[10];
        int i = 1;
        while (i <= 10) {
            vetorTabuada[i-1] = numeroDigitado * i;
            i++;
        }
        return vetorTabuada;
    }



}
