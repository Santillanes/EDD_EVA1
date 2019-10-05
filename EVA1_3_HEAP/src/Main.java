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
        int i = 10;                     //Stack
        Main mObj = new Main();         //Heap
        System.out.println(i);          //Stack
        System.out.println(mObj);       //Stack
        mObj = null; //NOS DESHACEMOS DE LA MEMORIA USADA
    }
    
}
