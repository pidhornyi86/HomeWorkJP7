package task1;

public class ClassC extends Thread {
    public void run () {
        try {
            sleep(300);
        }
        catch (InterruptedException c) {
            c.printStackTrace();
        }
        System.out.println(this.getClass().getSimpleName());
    }

}
