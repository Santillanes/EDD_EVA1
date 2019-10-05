
import java.util.Scanner;
import javax.swing.JOptionPane;

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
        Scanner sc = new Scanner (System.in);
        double grupos[][];
        //Preguntotar grupos //filas
        System.out.println("Cuántos grupos tiene?");
        int iNoGpos = sc.nextInt();
        sc.nextLine();
        grupos = new double [iNoGpos][];
        //Por grupo preguntar la cantidad de alumnos
        for (int i = 0; i < grupos.length; i++) {
            System.out.println("Cuántos alumnos tienes en el grupo " + (i+1) +"?");
            int iNoAlu = sc.nextInt();
            sc.nextLine();
            grupos[i] = new double [iNoAlu];
        }
        System.out.println("");
        for (int i = 0; i < grupos.length; i++) {
            System.out.println("Inserte calificaciones del grupo "+(i+1)+":");
            for (int j = 0; j < grupos[i].length; j++) {
                System.out.print("Calificación del alumno "+(j+1)+": ");
                grupos[i][j] = sc.nextDouble();
            }
            System.out.println("");
        }
        for (int i = 0; i < grupos.length; i++) {
        double ac = 0;
            System.out.println("Calificaciones del grupo "+(i+1)+": ");
            for (int j = 0; j < grupos[i].length; j++) {
                System.out.println("Alumno "+(j+1)+": "+grupos[i][j]);
                ac += grupos[i][j];
            }
            double promG = ac/(grupos[i].length);
            System.out.println("El promedio del grupo "+(i+1)+": "+promG);
            System.out.println("");
        }
        
        
    }
    
}
