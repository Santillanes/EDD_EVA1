/*
 * CREAR UN ARREGLO CON 50 ELEMENTOS, LLENARLO CON VALORES ALEATORIOS ENTRE 1 Y 100
 * E IMPRIMIR UNA LISTA CON LOS VALORES PARES QUE CONTENGA.
 */

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
        int ar[] = new int[50];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int)(Math.random()*100+1);
            if(ar[i]%2 == 0)
                System.out.println("["+ar[i]+"]");
        }
    }
    
}
