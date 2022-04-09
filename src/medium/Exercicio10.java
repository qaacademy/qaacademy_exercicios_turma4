package medium;

import javax.swing.JOptionPane;

public class Exercicio10 {

    public int calcularFibonacci(int termo) {
            int i = 2;
            int numDigitado = termo;
            int[] vetFibonacci = new int[numDigitado];
            vetFibonacci[0] = 0;
            vetFibonacci[1] = 1;
            while (i < numDigitado) {
                vetFibonacci[i] = vetFibonacci[i - 1] + vetFibonacci[i - 2];
                i++;
            }
            return vetFibonacci[termo-1];
    
        }

        public int[] calcularFibonacciVetor(int termo) {
            int i = 2;
            int numDigitado = termo;
            int[] vetFibonacci = new int[numDigitado];
            vetFibonacci[0] = 0;
            vetFibonacci[1] = 1;
            while (i < numDigitado) {
                vetFibonacci[i] = vetFibonacci[i - 1] + vetFibonacci[i - 2];
                i++;
            }
            return vetFibonacci;
    
        }
    }
    

