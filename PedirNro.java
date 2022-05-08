//Debemos realizar un programa que nos realizará una pregunta si queremos realizar una operación dada 
//o si deseamos salir/terminar el programa.
//Utilizaremos en este caso una simple operación que nos pide un número y luego lo imprime.

import java.util.Scanner;

public class PedirNro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un Numero: ");
        String nro = sc.next();sc.close();
        
        System.out.println("\nNro Ingresado: " + nro);
        System.out.println("\n**** Muchas Gracias ******\n");
    }
}
