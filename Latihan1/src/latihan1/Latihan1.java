package latihan1;

// Abstract class Kendaraan
abstract class Kendaraan {
String nama;
int jumlahRoda;

public Kendaraan(String nama, int jumlahRoda) {
this.nama = nama;
this.jumlahRoda = jumlahRoda;
}

// Method abstrak yang harus diimplementasikan oleh subclass
abstract void bergerak();

public void info() {
System.out.println(nama + " memiliki " + jumlahRoda + " roda.");
}
}

// Subclass Mobil
class Mobil extends Kendaraan {
public Mobil(String nama) {
super(nama, 4); // Mobil selalu punya 4 roda
}

@Override
void bergerak() {
System.out.println(nama + " bergerak dengan mesin bensin.");
}

}

// Subclass SepedaMotor
class SepedaMotor extends Kendaraan {
public SepedaMotor(String nama) {
super(nama, 2); // Sepeda motor selalu punya 2 roda
}

@Override
void bergerak() {
System.out.println(nama + " bergerak dengan mesin bensin.");
}
}

// Interface KendaraanListrik
interface KendaraanListrik {
void isiDaya(); // Method abstrak yang harus diimplementasikan
}

// Subclass MobilListrik yang merupakan Mobil dan juga KendaraanListrik
class MobilListrik extends Mobil implements KendaraanListrik {
public MobilListrik(String nama) {
super(nama);
}

@Override
void bergerak() {
System.out.println(nama + " bergerak dengan motor listrik.");
}

@Override
public void isiDaya() {
System.out.println(nama + " sedang diisi daya.");
}
}

// Main class untuk menjalankan program
public class Latihan1 {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil("Toyota");
        Kendaraan motor = new SepedaMotor("Honda");
        MobilListrik tesla = new MobilListrik("Tesla Model 3");
        mobil.info();
        mobil.bergerak();

        motor.info();
        motor.bergerak();
        
        tesla.info();
        tesla.bergerak();
        tesla.isiDaya();
    }
}