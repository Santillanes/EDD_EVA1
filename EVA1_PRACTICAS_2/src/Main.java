/*
 * -GENERAR UNA MATRIZ DE 100 x 100 ENTEROS, LLENARLOS CON CEROS Y UNOS, E IMPRIMIR
 */
/**
 * @author Luis Santillanes
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ar[][] = new int[100][100];
        for (int i = 0; i < ar[i].length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if(i == j)
                    ar[i][j] = 1;
                else
                    ar[i][j] = 0;
            }
        }
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print("["+ar[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
}
