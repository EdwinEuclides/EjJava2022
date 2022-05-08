/*  93 - 100    Excelente
    85 - 92     Sobresaliente
    75 - 84     Distinguido
    60 - 74     Bueno
    00 - 59     Desaprobado
*/
import java.util.*;
public class Calificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la nota: ");

        int nota = sc.nextInt();
        sc.close();;
        if(nota>-1 && nota<60) System.out.println("Desaprobado.");
        else if(nota>59 && nota<75) System.out.println("Bueno.");
        else if(nota>74 && nota<85) System.out.println("Distinguido.");
        else if(nota>84 && nota<93) System.out.println("Sobresaliente.");
        else if(nota>92 && nota<=100) System.out.println("Excelente.");
    }
}
