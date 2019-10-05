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
        int mat[][] = new int[2][3];
        int mat2[][];
        mat2 = new int[3][];
        mat2[0] = new int[10];
        mat2[1] = new int[100];
        mat2[2] = new int[24];
        
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                mat2[i][j] = (int)(Math.random()*10);
            }
        }
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                System.out.print("["+mat2[i][j]+"]");
            }
            System.out.println("");
        }
        
    }
    
}
