import java.util.Random;
import java.util.Scanner;

public class TebakAngka {
    public static void main(String[] args) {
        Random rand = new Random();
        int angkaRahasia = rand.nextInt(100) + 1; 
        int jumlahTebakan = 0;

        Scanner scanner = new Scanner(System.in);
        int tebakan = -1;

        System.out.println("Selamat datang di permainan Tebak Angka!");
        System.out.println("Saya telah memilih angka antara 1 hingga 100.");
        System.out.println("Coba tebak angkanya. Ketik 0 untuk keluar.");

        while (tebakan != angkaRahasia) {
            System.out.print("Masukkan tebakanmu: ");
            
            if (!scanner.hasNextInt()) {
                System.out.println("Masukkan hanya angka!");
                scanner.next();
                continue;
            }

            tebakan = scanner.nextInt();

            if (tebakan == 0) {
                System.out.println("Kamu memilih keluar. Angka rahasianya adalah " + angkaRahasia);
                break;
            }

            jumlahTebakan++;

            if (tebakan < angkaRahasia) {
                System.out.println("Terlalu kecil.");
            } else if (tebakan > angkaRahasia) {
                System.out.println("Terlalu besar.");
            } else {
                System.out.println("Selamat! Kamu menebak dengan benar dalam " + jumlahTebakan + " percobaan.");
            }
        }

        scanner.close();
    }
}

