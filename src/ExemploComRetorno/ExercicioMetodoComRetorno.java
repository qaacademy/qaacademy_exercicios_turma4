package ExemploComRetorno;

public class ExercicioMetodoComRetorno {

    public static void main(String[] args) {
        
       System.out.println(precoEtanol());
       System.out.println(precoGasolinaComum());
       System.out.println(precoGasolinaAditivada());
       System.out.println(precoDiesel());
       System.out.println(precoGnv());
       
    }

    public static String precoEtanol() {
        return "4,47";
    }

    public static String precoGasolinaComum() {
        return "6,77";
    }

    public static double precoDiesel() {
        return 5.77;
    }

    public static int precoGasolinaAditivada() {
        return 6;
    }

    public static String precoGnv() {
        return "3,77";
    }

}
