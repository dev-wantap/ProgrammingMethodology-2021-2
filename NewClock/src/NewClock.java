public class NewClock {
    public static void main(String[] args)  {
        NewClockWriter c = new NewClockWriter(600);
        while(true) {
            c.repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
