package eva1_1_exam_diag;

/**
 *
 * @author Luis Carlos Santillanes Loya - 18550694
 */
public class EVA1_1_EXAM_DIAG{
    
    //int iX;
    //static int iY;         //EN CUANTO EL PROGRAMA ARRANCA, A TODO LO STATIC SE LE RESERVA MEMORIA
   //
    public static void main(String[] args) {
        
        generaClave(); //EL MÉTODO TIENE QUE SER STATIC PARA PODER USARLO EN EL MAIN
                        //MÉTODOS NO ESTÁTICOS NO PUEDEN SER USADOS EN ESTÁTICOS. PERO LOS ESTÁTICOS SÍ EN LOS NO ESTÁTICOS.
        
    }

    //modificador de acceso [Static] [Valor de retorno] Nombre
    public static String generaClave(){
        int iVal;
        iVal = (int)(Math.random()*10000);
        String resu ="";
        if(iVal<10)//NECESITA 3 CEROS 000
            resu = "000"+iVal;
        else if(iVal<100)//NECESITA 2 CEROS 00
            resu = "00"+iVal;
        else if(iVal<1000)
            resu = "0"+iVal;
        else
            resu = ""+iVal;
            
        return resu;
    }
    
}