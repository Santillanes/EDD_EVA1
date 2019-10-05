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
        int mat[][] = new int[3][5];
        System.out.println("Matriz original");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = (int)(Math.random()*100+1);
                System.out.print("["+mat[i][j]+"]");
            }
            System.out.println("");
        }
        
                System.out.println("\nMatriz traspuesta");
        
        int mat2[][] = new int[5][3];
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                mat2[i][j] = mat[j][i];
                System.out.print("["+mat2[i][j]+"]");
            }
            System.out.println("");
        }
        
    }
    
}
