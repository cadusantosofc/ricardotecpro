import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Distancia percorrida: ");
        int distancia = sc.nextInt();

        System.out.print("Combustível gasto: ");
        double combustivel = sc.nextDouble();

        double consumoMedio = distancia / combustivel;

        System.out.printf("Consumo medio = %.3f%n", consumoMedio);

        sc.close();
    }
}
