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
        int aiDatos[] = new int[10];
        int aiCopia[] = new int[10];
        //AAREGLO ORIGINAL
        System.out.println("Arreglo Original");
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int)(Math.random()*100+1);
        }
        imprimirArreglo(aiDatos);
        //ARREGLO COPIA
        System.out.println("\nArreglo copia");
        for (int i = 0; i < aiCopia.length; i++) {
            aiCopia[i] = aiDatos[i];
        }
        imprimirArreglo(aiCopia);
        System.out.println("");
        System.out.println(aiDatos);
        System.out.println(aiCopia);
        aiDatos[0]=9999;
        imprimirArreglo(aiDatos);
        imprimirArreglo(aiCopia);
        
    }
    
    public static void imprimirArreglo(int[] a){
        System.out.println("");
        for (int i = 0; i < a.length; i++) {
            System.out.print("["+a[i]+"]");
        }
    }
    
}
