/*
 * CREAR DOS MATRICES DE 5 X 5
 * LLENAR CON NÚMERO ALEATORIOS (DOUBLES) ENTRE 1 Y 10
 * CREAR UNA MATRIZ DE 5 X 5 DONDE ALMACENE LOS RESULTADOS DE MULTIPLICAR CADA POSICIÓN DE LAS MATRICE
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
        double[][] ar1 = new double[5][5], ar2 = new double[5][5], arM = new double[5][5];
        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar1[i].length; j++) {
                ar1[i][j] = (Math.random()*10+1);
                ar2[i][j] = (Math.random()*10+1);
                arM[i][j] = (ar1[i][j])*(ar2[i][j]);
            }
        }
        System.out.println("Matriz 1");
        imp(ar1);
        System.out.println("Matriz 2");
        imp(ar2);
        System.out.println("MAtriz de multiplicación");
        imp(arM);
        
        
    }
    public static void imp(double[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("["+a[i][j]+"]--");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
