import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n--- MENU TO-DO LIST ---");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Lihat Semua Tugas");
            System.out.println("3. Hapus Tugas");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan tugas baru: ");
                    String task = input.nextLine();
                    toDoList.add(task);
                    System.out.println("Tugas berhasil ditambahkan.");
                    break;

                case 2:
                    if (toDoList.isEmpty()) {
                        System.out.println("Daftar tugas kosong.");
                    } else {
                        System.out.println("\n--- Daftar Tugas ---");
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }
                    }
                    break;

                case 3:
                    if (toDoList.isEmpty()) {
                        System.out.println("Tidak ada tugas untuk dihapus.");
                    } else {
                        System.out.print("Masukkan nomor tugas yang ingin dihapus: ");
                        int index = input.nextInt();
                        input.nextLine(); 
                        if (index >= 1 && index <= toDoList.size()) {
                            String removedTask = toDoList.remove(index - 1);
                            System.out.println("Tugas \"" + removedTask + "\" berhasil dihapus.");
                        } else {
                            System.out.println("Nomor tugas tidak valid.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan To-Do List.");
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}


    


