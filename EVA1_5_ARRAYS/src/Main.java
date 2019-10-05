/**
 *
 * @author Luis Santillanes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DECALARACIÓN DE ARREGLOS
        int aiDatos[] = new int[10];    //UN ARREGLO EN JAVA ES UN OBJETO
        //  N -->  NÚMERO DE ELEMENTOS  --> 10
        //  0 -->  1er elemento
        //  N-1  --->  Último elemento
        System.out.println(aiDatos);
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = ((int)(Math.random()*100)+1);
        }
        
        System.out.println("FOR NORMAL");
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.println(aiDatos[i]);
        }
        
        System.out.println("FOR EACH");
        //FOR-EACH
        //Primer parámetro es lo que almacena el arreglo (int en este caso)
        //Segundo parámetro es el arreglo
        for (int x : aiDatos) {
            System.out.println(x);
        }
        
    }
    
}
