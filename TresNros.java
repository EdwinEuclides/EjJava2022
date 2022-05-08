//Realizar un programa que al ejecutar se pueda ingresar 3 números enteros, para luego imprimirlos por pantalla de la siguiente manera:

//El primer nro ingresado es: 4
//El segundo nro ingresado es: 5
//El tercer nro ingresado es: 6
import java.util.Scanner;

public class TresNros{

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Ingrese el primer Nro: ");
        int x1 = sc.nextInt();

        System.out.println("Ingrese el segundo Nro: ");
        int x2 = sc.nextInt();

        System.out.println("Ingrese el tercer Nro: ");
        int x3 = sc.nextInt(); sc.close();

        System.out.println("*** Resultado ****");
        System.out.println("Primer Nro: " + x1);
        System.out.println("Segundo Nro: " + x2);
        System.out.println("tercer Nro: " + x3);

    }
}
