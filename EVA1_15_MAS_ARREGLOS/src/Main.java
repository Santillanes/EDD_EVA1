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
        int num = 10;
        System.out.println("num = " + num);
        incrementa(num);        //SE PASA EL VALOR, UNA COPIA DE num, O SEA, EL 10
        System.out.println("num = " + num);
        //----------
        Prueba obj = new Prueba();
        obj.iVal = 10;
        System.out.println("Obj = " + obj.iVal);
        incrementa2(obj);       //SE PASA EL VALOR DE obj, O SEA, LA DIRECCIÓN
        System.out.println("Obj = " + obj.iVal);
        /*
            *****     JAVA TRABAJA CON PASO POR VALOR, NO POR REFERENCIA     *****
        */
    }
    public static void incrementa(int a){
        a++;
    }
    public static void incrementa2(Prueba obj){
        obj.iVal++;
    }
}
class Prueba{
    int iVal;
}
