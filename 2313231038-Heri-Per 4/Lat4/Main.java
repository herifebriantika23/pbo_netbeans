interface Hewan {

void makan();

}

interface Mamalia {

void menyusui();

}

class Kucing implements Hewan, Mamalia {

@Override
public void makan() { 
    System.out.println("Kucing makan ikan."); }

@Override
public void menyusui() { 
    System.out.println("Kucing menyusui anaknya."); }

}

public class Main {

public static void main(String[] args) {
        
Kucing kucing1 = new Kucing();

kucing1.makan();

kucing1.menyusui();

}

}

