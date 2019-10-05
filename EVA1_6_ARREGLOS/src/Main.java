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
        //DECLARACIÓN
        int aiDatos[], a, b;
        int[] aiDatos2, x, y;
        //
        int aiCopia[];
        //INICIALIZACIÓN DEL ARREGLO
        int tama = 100;
        aiDatos = new int [tama];
        //LLENAR CON VALORES ALEATORIOS
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i]=(int)(Math.random()*100+1);
        }
        System.out.println(aiDatos);
        tama = 200;
        aiDatos = new int [tama];
        //LLENAR CON VALORES ALEATORIOS
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i]=(int)(Math.random()*100+1);
        }
        System.out.println(aiDatos);
        //SON OBJETOS
        //lA MEMORIA ES CONSECUTIVA
        //SON DE ACCESO ALEATORIO
        aiDatos[4] = 5000;
        aiDatos[69] = 500;
        //SON MUY RÁPIDOS
        //SON INMUTABLES --- No se puede cambiar el tamaño del arreglo, se crearía un arreglo nuevo
        int[] aiPrueba = new int[3];
        aiPrueba = new int[2]; //Aquí se creó un arreglo nuevo y el anterior se hace basura y se borra
    }
    
}
