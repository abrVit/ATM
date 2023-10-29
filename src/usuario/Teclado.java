package usuario;

import java.util.Scanner;

public class Teclado {

    public static void mensagem(String texto){
        System.out.println(texto);
    }
    public static String entradaStr(){
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    public static int entradaInt(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static double entradaDouble(){
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }
}
