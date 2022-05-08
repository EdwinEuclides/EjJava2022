import java.util.Scanner;

public class N_TresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\"f\": finalizar.");
        Boolean fin = sc.next().equals("f") ? true : false;

        while (!fin) {
            System.out.println("Ingrese el primer Nro: ");
            int x1 = sc.nextInt();

            System.out.println("Ingrese el segundo Nro: ");
            int x2 = sc.nextInt();

            System.out.println("Ingrese el tercer Nro: ");
            int x3 = sc.nextInt();
            
            System.out.println("\n*** Resultado ****");
            System.out.println("Primer Nro: " + x1);
            System.out.println("Segundo Nro: " + x2);
            System.out.println("tercer Nro: " + x3);

            System.out.println("\n\"f\": finalizar.");
            fin = sc.next().equals("f") ? true : false;
        }

        System.out.println("\n**** Muchas Gracias ******\n");
        sc.close();
    }
}
