
public class Main {

    public static void main(String[] args) {
        suma(4, 2, 5);

        Coche miAuto = new Coche();
        miAuto.addDoor();
        System.out.println("miAuto tiene " + miAuto.nDoors + " puertas");

    }

    public static void suma(int a, int b, int c) {
        System.out.println(a+b+c);
    }
}

class Coche {
    public int nDoors = 2;

    public void addDoor() {
        this.nDoors++;
    }
}
