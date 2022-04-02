package easy;

public class Exercicio07 {

    public double calcularInss(double salario) {

        double inss = 0;

        if (salario <= 1045.00) {
            inss = salario * 0.075;
        }

        if (salario >= 1045.01 && salario <= 2089.60) {
            inss = salario * 0.09;
        }

        if (salario >= 2089.61 && salario <= 3134.40) {
            inss = salario * 0.12;
        }
        if (salario >= 3134.41 && salario <= 6101.06) {
            inss = salario * 0.14;
        }
        if (salario > 6101.06) {
            inss = 854.15; // Teto
        }
        return inss;
    }

}
