package task1;

public class Main {
    public static void main(String[] args) {
        Thread classA = new ClassA ();
        Thread classB = new ClassB();
        Thread classC = new ClassC();
        classA.start();
        classB.start();
        classC.start();
    }
}
