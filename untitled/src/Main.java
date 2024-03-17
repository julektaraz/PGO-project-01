import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadz liczbe: ");

        int number = scanner.nextInt();

        scanner.close();

        if (number > 0) {

            System.out.println("Liczba jest pozytywna");

        } else if (number < 0) {

            System.out.println("Liczba jest negatywna");

        } else {

            System.out.println("Liczba jest rowna 0");

        }

    }

}