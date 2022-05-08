import java.util.Scanner;

public class N_DiaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\"f\": finalizar.");
        Boolean fin = sc.next().equals("f") ? true : false;

        while (!fin) {
            System.out.println("Ingrese el Nro de día: ");
            int dia = sc.nextInt();

            switch (dia) {
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Lunes");
                    break;
                case 3:
                    System.out.println("Martes");
                    break;
                case 4:
                    System.out.println("Miercoles");
                    break;
                case 5:
                    System.out.println("Jueves");
                    break;
                case 6:
                    System.out.println("Viernes");
                    break;
                case 7:
                    System.out.println("Sabado");
                    break;
                default:
                    System.out.println("Dia incorrecto");
                    break;
            }
            System.out.println("\n\"f\": finalizar.");
            fin = sc.next().equals("f") ? true : false;
        }

        System.out.println("\n**** Muchas Gracias ******\n");
        sc.close();
    }
}
