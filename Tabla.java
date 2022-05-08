//Desarrollar un programa que dado un número entero ingresado, 
//nos retorne los valores de ese número multiplicado por 1, 2, 3, … y 10.

import java.util.Scanner;

public class Tabla{
    public static void main(String[] args) {
        System.out.println("De que numero quiere la tabla: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<=10;i++)
            System.out.println(n + "*" + i + " = " + n*i);

        sc.close();
    }
}
