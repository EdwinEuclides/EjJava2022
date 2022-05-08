import java.util.Scanner;

public class N_Tabla {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\"f\": finalizar.");
        Boolean fin = sc.next().equals("f") ? true : false;

        while (!fin) {
        System.out.println("De que numero quiere la tabla: ");
        int n=sc.nextInt();

        for(int i=0;i<=10;i++)
            System.out.println(n + "*" + i + " = " + n*i);

            
            System.out.println("\n\"f\": finalizar.");
            fin = sc.next().equals("f") ? true : false;
        }
        
        System.out.println("\n**** Muchas Gracias ******\n");
        sc.close();
    }

}
