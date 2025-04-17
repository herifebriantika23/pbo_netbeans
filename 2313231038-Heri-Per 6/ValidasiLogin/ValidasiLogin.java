import java.util.Scanner;

public class ValidasiLogin {
    public static void main(String[] args) {

        String correctUsername = "admin";
        String correctPassword = "password123";

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        boolean success = false;

        while (attempts < 3) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();

            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Selamat datang, " + username + "!");
                success = true;
                break;
            } else {
                System.out.println("Username atau password salah.\n");
                attempts++;
            }
        }

        if (!success) {
            System.out.println("Akun diblokir!");
        }

        scanner.close();
    }
}
