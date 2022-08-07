import java.util.Scanner;

public class Menu {
    static void showMenu() {
        int num;
        do {
            Scanner sc = new Scanner(System.in);
            Calculadora myCalculadora = new Calculadora();

            System.out.println("Bienvenido a la calculadora experimental");
            System.out.println("constrida en poo");
            System.out.println("que es lo que quieres hacer?");
            System.out.println("preciona 1 para hacer una suma");
            System.out.println("preciona 2 para hacer una resta");
            System.out.println("preciona 3 para hacer una multiplicacion");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    myCalculadora.suma();
                    break;
                case 2:
                    myCalculadora.resta();
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Guey solo tiene que ser de 0 a 4 no sabes leer acaso mamawebo :v");
            }
        } while (num != 0);


    }
}
