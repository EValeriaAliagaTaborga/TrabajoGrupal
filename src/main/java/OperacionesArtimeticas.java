public class OperacionesArtimeticas {

    public int Suma(int a, int b){
        return a+b;
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
}
