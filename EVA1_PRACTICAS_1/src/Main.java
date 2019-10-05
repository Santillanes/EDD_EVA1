
import java.util.Scanner;

/*
 * PRÁCTICA 1: 
CAPTURAR EDADES: 
SOLICITAR AL USUARIO LA CANTIDAD DE EDADES A CAPTURAR. 
CAPTURAR LA CANTIDAD DE EDADES SOLICITADAS (ENTEROS) 
CALCULAR LA MEDIA, LA MODA, DESVIACIÓN ESTÁNDAR (LA MEDIANA NO SE PUEDE CALCULAR HASTA QUE SEPAMOS COMO ORDENAR ARREGLOS)
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de edades que introducirá:");
        int n = Integer.parseInt(sc.nextLine());
        int ar[] = new int[n];
        double sum = 0;
        for (int i = 0; i < ar.length; i++) {
            System.out.print("Introduzca la edad #"+(i+1)+": ");
            ar[i] = sc.nextInt();
            sum += ar[i];
        }
        double med = sum/n;
        System.out.println("La media de las edades es: "+med);
        
        int moda = 0;
        int maxRep = 0;
        for (int i = 0; i < ar.length; i++) {
            int rep = 0;
            for (int j = 0; j < ar.length; j++) {
                if(ar[i] == ar[j])
                    rep++;
                if(rep>maxRep){
                    moda = ar[i];
                    maxRep = rep;
                }
            }
        }
        System.out.println("La moda de las edades es: "+moda);
        
        double nume = 0;
        for (int i = 0; i < ar.length; i++) {
            double res = ar[i]-med;
            nume += (Math.pow(res, 2));
        }
        double de = Math.pow((nume/n), 0.5);
        System.out.println("La desviación estándar es: "+de);
    }
    
}
