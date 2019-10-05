/*
 * TOME LA PRÁCTICA 5 COMO BASE. GENERE UN ARREGLO QUE CONTENGA EXACTAMENTE LA MISMA CANTIDAD 
 * DE VALORES PARES DEL ARREGLO CON VALORES ALEATORIOS. COPIE LOS VALORES PARES AL NUEVO ARREGLO. 
 * HAGA LO MISMO PARA LOS VALORES IMPARES.

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
        int ar[] = new int[50];
        int contPar = 0;
        int contImpar = 0;
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int)(Math.random()*100+1);
            if(ar[i]%2 == 0)
                contPar++;
            else
                contImpar++;
        }
        
        int[] arPar = new int[contPar], arImpar = new int[contImpar];
        for (int i = 0; i < arPar.length; i++) {
            
        }
    }
    
}
