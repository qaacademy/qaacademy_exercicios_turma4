package easy;

import javax.swing.JOptionPane;

public class Exercicio11 {

    public int somarDois(int numeroDigitado) {
        int i = 1;
        while (i <= 100) {
            numeroDigitado = numeroDigitado + 2;
            i++; // i = i +1;
        }
        return numeroDigitado;
    }

    public int [] somarDoisComVetor(int numeroDigitado) {
        int[] vetorSoma = new int[100];

        int i = 1;
        while (i <= 100) {
            numeroDigitado = numeroDigitado +2;
            vetorSoma[i - 1] = numeroDigitado;
            i++; // i = i +1;
        }
        return vetorSoma;
    }
}