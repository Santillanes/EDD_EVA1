/**
 *
 * @author Luis Santillanes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ar[] = new int[10];
        System.out.println("ar = " + ar);
        llenarArreglo(ar);
        imprimir(ar);
        madrearArreglo(ar);
        System.out.println("ar = " + ar);
    }
    public static void llenarArreglo(int[] a){
        System.out.println("a = " + a);
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*100);
        }
    }
    public static void imprimir(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print("["+a[i]+"]");
        }
        System.out.println("");
    }
    public static void madrearArreglo(int[] a){
        a = new int[100];
        System.out.println("a = " + a);
    }
}
