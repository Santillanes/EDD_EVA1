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
        int matriz[][] = new int[3][5];
        //FOR ANIDADO
        for (int i = 0; i < matriz.length; i++) { //FILAS
            for (int j = 0; j < matriz[i].length; j++) { //COLUMNAS
                matriz[i][j] = (int)(Math.random()*100);
            }
        }
        //IMPRIMIR LA MATRIZ
        for (int i = 0; i < matriz.length; i++) { //FILAS
            for (int j = 0; j < matriz[i].length; j++) { //COLUMNAS
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
}
