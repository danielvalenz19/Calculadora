import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Calculadora {

    public static double PI=3.1415;
    public void resta(){
        int n1;
        int n2;
        int res;
        Scanner sc = new Scanner(System.in);
        System.out.println("----resta----");
        System.out.println("escribe el primer numero para restar");
        n1=sc.nextInt();
        System.out.println("escribe el segundo numero para restar");
        n2=sc.nextInt();
        res=n1-n2;
        System.out.println("el resultado de la resta es! "+res);
        System.out.println("");
        System.out.println("");

    }
    public void suma(){
        int n1,n2;
        int sum;
        Scanner sc = new Scanner(System.in);

        System.out.println("----suma----");
        System.out.println("escribe el primer numero para sumar");
        n1=sc.nextInt();
        System.out.println("escribe el segundo numero para sumar");
        n2=sc.nextInt();
        sum=n1+n2;
        System.out.println("la suma de los dos numeros dados es! "+sum);

    }

}

