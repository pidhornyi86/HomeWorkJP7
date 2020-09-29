package task1;

public class ClassB extends Thread {
    public void run () {
        try {
            sleep(200);
        }
        catch (InterruptedException b) {
            b.printStackTrace();
        }
        System.out.println(this.getClass().getSimpleName());
    }

}

