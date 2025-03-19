class Hewan {

void makan() { System.out.println("Hewan sedang makan."); }

}

class Kucing extends Hewan {

void suara() { System.out.println("Meow!"); }

}

class Anjing extends Hewan {

void suara() { System.out.println("Guk Guk!"); }

}



public class Main {

public static void main(String[] args) {
        
Kucing kucing1 = new Kucing();

System.out.println("~~~~Kucing~~~~");

kucing1.makan();

kucing1.suara();

Anjing anjing1 = new Anjing();

System.out.println("~~~~Anjing~~~~");

anjing1.makan();

anjing1.suara();

}
}