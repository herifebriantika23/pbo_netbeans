// Kelas induk (superclass)

class Hewan {

String nama;

void makan() {

System.out.println(nama + " sedang makan.");

}

}

// Kelas anak (subclass) yang mewarisi dari Hewan

class Kucing extends Hewan {

void suara() {

System.out.println(nama + " mengeong: Meow!");

}

}

class Anjing extends Hewan {

void suara() {

System.out.println(nama+" menggonggong: Guk Guk!");

}

}


// Main class untuk menjalankan program

public class Main {

public static void main(String[] args) {

Kucing kucing1 = new Kucing();

kucing1.nama = "Tom";

kucing1.makan(); // Memanggil metode dari superclass

kucing1.suara(); // Memanggil metode dari subclass

Anjing anjing1 = new Anjing();

anjing1.nama = "Spike";

anjing1.makan();

anjing1.suara();

}

}