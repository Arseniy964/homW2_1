public class Main {
    public static void main(String[] args) {
        ComplexType complex1 = new ComplexType("Type1", 10);
        ComplexType complex2 = new ComplexType("Type2", 20);

        Level2 objectA = new Level2(1, complex1, Status.ACTIVE);
        Level3 objectB = new Level3(2, complex2, Status.PENDING);
        Level3 objectC = new Level3(3, complex1, Status.INACTIVE);

        System.out.println("ObjectA properties:");
        objectA.display();
        objectA.display("Prefix: ");
        objectA.display("Prefix: ", " :Suffix");

        System.out.println("\nObjectB properties:");
        objectB.display();
        objectB.display("Prefix: ");
        objectB.display("Prefix: ", " :Suffix");

        System.out.println("\nObjectC properties:");
        objectC.display();
        objectC.display("Prefix: ");
        objectC.display("Prefix: ", " :Suffix");
    }
}