import java.util.*;
public class N_Calificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean fin= false;
        do{
            System.out.println("Ingrese la nota: ");
            int nota = sc.nextInt();
        
            if(nota>-1 && nota<60) System.out.println("Desaprobado.");
            else if(nota>59 && nota<75) System.out.println("Bueno.");
            else if(nota>74 && nota<85) System.out.println("Distinguido.");
            else if(nota>84 && nota<93) System.out.println("Sobresaliente.");
            else if(nota>92 && nota<=100) System.out.println("Excelente.");

            System.out.println("\n\"f\": finalizar.");
            fin = sc.next().equals("f") ? true:false;
        }while(!fin);

        sc.close();

        System.out.println("\n**** Muchas Gracias ******\n");
    }
}
