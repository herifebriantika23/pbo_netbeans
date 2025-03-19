class Hewan {

void makan() {
System.out.println("Hewan sedang makan."); }

}

class Kucing extends Hewan {

void suara() {
System.out.println("Meow!"); }

}


class Anjing extends Hewan {

void suara(){
System.out.println("Guk Guk!"); }

}


class KucingAnggora extends Kucing {

void jenis() { System.out.println("Ini adalah kucing anggora."); }

}

class AnjingBulldog extends Anjing {

void jenis() {System.out.println("Ini adalah anjing bulldog.");}
}

public class Main {

public static void main(String[] args) {

KucingAnggora anggora = new KucingAnggora();

anggora.makan(); // Dari superclass Hewan

anggora.suara(); // Dari subclass Kucing

anggora.jenis(); // Dari subclass KucingAnggora

AnjingBulldog bulldog = new AnjingBulldog();

bulldog.makan(); // Dari superclass Hewan

bulldog.suara(); // Dari subclass Anjing

bulldog.jenis(); // Dari subclass AnjingBulldog

}

}
