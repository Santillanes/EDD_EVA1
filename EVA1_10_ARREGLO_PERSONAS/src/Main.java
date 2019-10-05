
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        Scanner p = new Scanner(System.in);
        Persona[] per = new Persona[2];
        for (int i = 0; i < per.length; i++) {
            per[i] = new Persona();
            System.out.println("Ingresa nombre: ");
            per[i].nombre = p.nextLine();
            //System.out.println("Ingresa apellido: ");
            //per[i].apellido = p.nextLine();
        }
        
        imprimirArreglo(per);
        
        Persona[] copia = new Persona[per.length];
        for (int i = 0; i < per.length; i++) {
            copia[i] = new Persona();
            copia[i].nombre = per[i].nombre;
        }
        per[1].nombre = "Hola";
        imprimirArreglo(copia);
        imprimirArreglo(per);
    }
    public static void imprimirArreglo(Persona[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.println("Nombre: " + args[i].nombre);
        }
    }
}
class Persona{
    String nombre;
   // String apellido;
}
