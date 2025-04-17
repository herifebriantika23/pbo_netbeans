import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char lagi;

        do {
            System.out.print("Masukkan angka pertama: ");
            double num1 = scanner.nextDouble();

            System.out.print("Masukkan operator (+, -, *, /, %): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Masukkan angka kedua: ");
            double num2 = scanner.nextDouble();

            double hasil;

            switch (operator) {
                case '+':
                    hasil = num1 + num2;
                    System.out.println("Hasil: " + hasil);
                    break;
                case '-':
                    hasil = num1 - num2;
                    System.out.println("Hasil: " + hasil);
                    break;
                case '*':
                    hasil = num1 * num2;
                    System.out.println("Hasil: " + hasil);
                    break;
                case '/':
                    if (num2 != 0) {
                        hasil = num1 / num2;
                        System.out.println("Hasil: " + hasil);
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                    }
                    break;
                case '%':
                    hasil = num1 % num2;
                    System.out.println("Hasil: " + hasil);
                    break;
                default:
                    System.out.println("Error: Operator tidak valid.");
            }

            System.out.print("Apakah Anda ingin menghitung lagi? (y/n): ");
            lagi = scanner.next().charAt(0);

        } while (lagi == 'y' || lagi == 'Y');

        scanner.close();
        System.out.println("Terima kasih telah menggunakan kalkulator.");
    }
}

