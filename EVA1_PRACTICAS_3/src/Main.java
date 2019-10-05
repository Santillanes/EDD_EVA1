/*
 * GENERAR UNA MATRIZ DE 5 X 5 ENTEROS
 * LLENAR CON NÚMERO ALEATORIOS ENTRE 1 Y 100 E IMPRIMIR
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
        int ar[][] = new int[5][5];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = (int)(Math.random()*100+1);
            }
        }
        impAr(ar);
        
        int copia[][] = new int[5][5];
        
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                copia[copia.length-i-1][copia[i].length-j-1] = ar[i][j];
            }
        }
        
        System.out.println("");
        impAr(copia);
        
        
    }
    public static void impAr(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("["+a[i][j]+"]");
            }
            System.out.println("");
        }
    }
}
