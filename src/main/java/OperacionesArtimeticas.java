public class OperacionesArtimeticas {

    public static int suma(int a, int b){
        return a+b;
    }
    public static int resta(int a, int b){
        return a-b;
    }

    public static int Potencia(int a,int b){
        return (int)Math.pow(a, b);
    }

    public static int div(int a, int b){
        if (a > Integer.MAX_VALUE || b > Integer.MAX_VALUE){
            System.out.println("valores muy altos");
            return 0;
        } else if (b == 0){
            System.out.println("división por 0");
            return 0;
        }else {
            return a / b;
        }

    }

    public int multiplicar(int a, int b) {
        return a*b;
    }

}
