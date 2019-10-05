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
        
        prueba[] apArreglo = new prueba[5];
        prueba[] apCopia = new prueba[5];
        for (int i = 0; i < apArreglo.length; i++) {
            apArreglo[i] = new prueba();
            apArreglo[i].x = (int)(Math.random()*100+1);
        }
        
        for (int i = 0; i < apArreglo.length; i++) {
            apCopia[i] = new prueba();
            apCopia[i].x = apArreglo[i].x;  
            System.out.println("Copia "+i+" = "+apCopia[i]);
            System.out.println("arreglo "+i+" = "+apArreglo[i]);
        }
        
    }
  
}
  
    class prueba{
        int x;
    }