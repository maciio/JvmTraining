public class Prueba{
    private static String hola;
    public static void main (String... args){
        int x = -9;
        int y = 2;
        System.out.println("output= " +x%y);
        String [] anedac = {" 0 "," 1 "};
        System.out.println("Prueba de java");
        new Prueba().testing(hola);
        go(anedac,41);
    }
    
    public static void go(String [] x, int y){
        System.out.println("x= "+ x[0] + "  y= "+ y);
    }
    public void testing(){
        int tst = 0;
        System.out.println(tst);
    }

    public void testing(String cadena){
        System.out.println(cadena);
    }
}
