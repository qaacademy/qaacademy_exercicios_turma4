package easy;

import javax.swing.JOptionPane;

public class Exercicio07 {

    public double calculaInss(double salario) {
        double inss = 0.0; // declaração das variaveis
        if (salario <= 1045.00) {// abertura
            inss = salario * 0.075; // 7,5%
        } // fechamento do if
        if (salario >= 1045.01 && salario <= 2089.60) {
            inss = salario * 0.09; // 9%
        }
        if (salario >= 2089.61 && salario <= 3134.40) {
            inss = salario * 0.12;// 12%
        }

        if (salario >= 3134.41 && salario <= 6101.06) {
            inss = salario * 0.14; // 14%
        }
        if (salario > 6101.06) {
            inss = 854.15; // Teto
        }
        return inss;

    }

}
