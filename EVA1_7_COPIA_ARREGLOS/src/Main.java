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
        int aiDatos[] = new int [10];
        int aiCopia[] = new int[10];
        
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int)(Math.random()*100+1);
        }
        System.out.println("Datos originales");
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.print("["+aiDatos[i]+"]");
        }
        
        aiCopia = aiDatos; //APUNTAN A LA MISMA DIRECCIÓN, EXISTE SÓLO UN OBJETO CON DOS VARIABLES QUE APUNTAN A ÉL
        
        System.out.println("\nDatos copiados");
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.print("["+aiCopia[i]+"]");
        }
        System.out.println("");
        System.out.println(aiCopia);
        System.out.println(aiDatos);
    }
    
}
