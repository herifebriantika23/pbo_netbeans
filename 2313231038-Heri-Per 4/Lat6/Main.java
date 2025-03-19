class Kalkulator {

// Metode pertama: Menjumlahkan dua angka

int tambah(int a, int b) {

return a + b;

}

int kurang(int a, int b) {

return a - b;

}

int kali(int a, int b) {

return a * b;

}

int bagi(int a, int b ) {

return a / b;

}


// Metode kedua: Menjumlahkan tiga angka(Overloading)

int tambah(int a, int b, int c) {

return a + b + c;

}

int kurang(int a, int b, int c ) {

return a - b - c;

}

int kali(int a, int b, int c ) {

return a * b * c;

}

int bagi(int a, int b, int c ) {

return a / b / c;

}

// Metode ketiga: Menjumlahkan dua angka desimal(Overloading)

double tambah(double a, double b) {

return a + b;

}

double kurang (double a, double b) {

return a - b;

}

double kali(double a, double b) {

return a * b;

}

double bagi(double a, double b) {

return a / b;

}

}

public class Main {

public static void main(String[] args) {

Kalkulator k = new Kalkulator();

System.out.println("~~~~Metode Pertama~~~~");

System.out.println(k.tambah(2, 4)); // Memanggil rumus tambah pada metode pertama

System.out.println(k.kurang(2, 4)); // Memanggil rumus kurang pada metode pertama

System.out.println(k.kali(2, 4)); // Memanggil rumus kali pada metode pertama

System.out.println(k.bagi(2, 4)); // Memanggil rumus bagi pada metode pertama

System.out.println("~~~~Metode Kedua~~~~");

System.out.println(k.tambah(2, 4, 6)); // Memanggil rumus tambah pada metode kedua

System.out.println(k.kurang(2, 4, 6)); // Memanggil rumus kurang pada metode kedua

System.out.println(k.kali(2, 4, 6)); // Memanggil rumus kali pada metode kedua

System.out.println(k.bagi(2, 4, 6)); // Memanggil rumus bagi pada metode kedua

System.out.println("~~~~Metode Ketiga~~~~");

System.out.println(k.tambah(2.5, 4.5)); // Memanggil rumus tambah pada metode ketiga

System.out.println(k.kurang(2.5, 4.5)); // Memanggil rumus kurang pada metode ketiga

System.out.println(k.kali(2.5, 4.5)); // Memanggil rumus kali pada metode ketiga

System.out.println(k.bagi(2.5, 4.5)); // Memanggil rumus bagi pada metode ketiga

}
}


