package exemplosMetodosSemRetorno;

public class ExemploComParametros {

    public static void main(String[] args) {
       System.out.println(
           retornaPalavra("Flavio", "Dias"));
        
    }

    public static String verificaMelhorCombustivel(double valorGasolina, double valorEtanol) {
        double resultado;

        resultado = (valorEtanol / valorGasolina);
        if (resultado >= 0.7) {
            return "Gasolina mais vantasojo" + resultado;
        }else{
            return "Etanol mais vantasojo! " + resultado;
        }

    }

    public static String retornaPalavra(String palavraUm, String palavraDois) {

        return palavraUm +" - " +palavraDois;
    }

}
