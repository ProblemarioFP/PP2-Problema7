/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema7;
import java.util.*;
/**
 *
 * @author Miguel
 */
public class PP2Problema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double dato,conv;    // Declaracion de variables
    
    dato= pedirDato();          //Declaracion de metodos
    conv= convertirDato(dato);
    mostrarResultado(dato,conv);
    }
    public static double pedirDato() {      //Metodo para pedir datos por teclado
        double dato;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introducir valor númerico expresado en km/h");
        dato= entrada.nextInt();
        return dato;
    }
    public static double convertirDato(double x) {      //metodo que convierte un dato que se encuentra en km/h a m/s
        double conv;
        conv= x/3.6;
        return conv;
    }
    public static void mostrarResultado(double x, double y) {       //Metodo que muestra el resultado de la conversión
        System.out.println(x+" kilometros por hora son iguales a "+y+" metros por segundo.");
    }
    
}
