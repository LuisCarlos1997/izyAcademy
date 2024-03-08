package interactions;

public class Time {

    public static void sleep (int milisegundo)  {
        try {
            Thread.sleep(milisegundo);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
