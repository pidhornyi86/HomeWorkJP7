package task1;

public class ClassA extends Thread {

    public void run () {
try {
sleep(100);
}
catch (InterruptedException a) {
    a.printStackTrace();
}
        System.out.println(this.getClass().getSimpleName());
    }

}
