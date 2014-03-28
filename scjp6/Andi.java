class Horse {
    static String s = "";
    void beBrisk() { s += "trot "; }
}
public class Andi extends Horse {
    void beBrisk() { s += "tolt "; }
    public static void main(String[] args) {
        Horse x0 = new Horse();
        Horse x1 = new Andi();  x1.beBrisk();
        Andi x2 = (Andi)x1;
        Andi x3 = (Andi)x0;
        System.out.println(s);
    } 
}