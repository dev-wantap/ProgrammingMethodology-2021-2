import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterController {

    private Counter counter;
    private CounterFrame frame;

    public CounterController(Counter c, CounterFrame f) {
        counter = c;
        frame = f;
    }

}
