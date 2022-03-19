package exerciciosMetodos;

public class ExerciciosParametros {



    public static void exibePalavraParametro(String palavra) {
        System.out.println(palavra);
    }

    public static void exibeNumeParametro(int numero) {
        System.out.println(numero);
    }

    public static void exibeDoubleParametro(double numero) {
        System.out.println(numero);
    }

    public static void exibeBooleanParametro(boolean estado) {
        System.out.println(estado);
    }

    public static void exibeFloatParametro(float numero) {
        System.out.println(numero);
    }

    public static String exibePalavraParametroComRetorno(String palavra) {
        return palavra;
    }

    public static int exibeNumeroParametroComRetorno(int numero) {
        return numero;
    }

    public static double exibeDoubleParametroRetorno(double numero) {
        return numero;
    }

    public static boolean exibeBooleanParametroRetorno(boolean estado) {
        return estado;
    }

    public static float exibeFloatParametroRetorno(float numero) {
        return numero;
    }


    public static void main(String[] args) {

        // void
        exibePalavraParametro("Teste");
        exibeNumeParametro(10);
        exibeDoubleParametro(10000.00);
        exibeBooleanParametro(true);
        exibeFloatParametro(50.00F);

        // com retorno
        System.out.println(exibePalavraParametroComRetorno("Teste com retorno"));
        System.out.println(exibeNumeroParametroComRetorno(99));
        System.out.println(exibeDoubleParametroRetorno(99.9));
        System.out.println(exibeBooleanParametroRetorno(10 < 5));
        float numeroParametro = exibeFloatParametroRetorno(20.00F) + exibeFloatParametroRetorno(10.00F);
    }

}
