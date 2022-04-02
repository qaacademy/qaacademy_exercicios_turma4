package easy;

import javax.swing.JOptionPane;

public class Exercicio10 {

    public double calcularInvestimento(double valorInvestimento, double taxaJuros) {

        double valorJuros = 0;
        int i = 1;

        while (i <= 10) {
            valorJuros = (valorInvestimento * taxaJuros) + valorJuros;
            i = i + 1; // i++
        }

        return valorJuros;

    }

}
