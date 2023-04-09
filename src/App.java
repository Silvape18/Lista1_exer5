import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner entrada = new Scanner(System.in);
       float metros;
       float cm;

       System.out.print("Digite um medida em metros:");
       metros = entrada.nextInt();
       cm = metros*100;
       System.out.println("A conversão em cm é :" + cm);
    }
}
