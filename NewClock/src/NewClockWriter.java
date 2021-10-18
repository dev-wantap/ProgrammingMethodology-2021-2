import java.awt.*;
import javax.swing.*;
import java.time.*;

public class NewClockWriter extends JPanel{

    private final int WIDTH;

    /**
     * ClockWriter - 창 만들기
     * @param width    - WIDTH(Size)
     */
    public NewClockWriter(int width) {
        WIDTH = width;
        JFrame frame = new JFrame();
        frame.getContentPane().add(this);
        frame.setTitle("Clock");
        frame.setSize(WIDTH,WIDTH);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     * paintComponent - 내용 그리기
     * @param g       - 그래픽
     * NewTimeManager Class 이용 현재 시간 및 날짜 받아오기
     */

    public void paintComponent(Graphics g) {
        // 현재 시, 분, 초 받아오기(TimeManager 이용)
        LocalTime now = LocalTime.now();
        NewTimeManager tm = new NewTimeManager(now);
        tm.reset();

        // 시계 각도 계산
        int minutes_angle = 90 - tm.getNowMinute() * 6;
        int hours_angle = 90 - tm.getNowHour() * 30 - tm.getNowMinute() * 2;
        int seconds_angle = 90 - tm.getNowSecond() * 6;

        g.setColor(Color.white);
        g.fillRect(0,0,WIDTH,WIDTH);
        int x = (WIDTH/4)+20;
        int y = (WIDTH/4)+20;
        int diameter = 250;
        g.setColor(Color.black);
        g.drawOval(x,  y, diameter, diameter);

        g.setColor(Color.white);
        g.fillOval(x+4,  y+4, diameter-10, diameter-10);
        g.setColor(Color.red);
        g.fillArc(x+5, x+5, diameter-10, diameter-10, minutes_angle, 5);
        g.setColor(Color.blue);
        g.fillArc(x+25, x+25, diameter-50, diameter-50, hours_angle, -8);
        g.setColor(Color.black);
        g.fillArc(x+5, x+5, diameter-10, diameter-10, seconds_angle, 3);

        g.setColor(Color.gray);
        g.setFont(new Font("Calibri",Font.BOLD,30));

        g.drawString(tm.getNowWeek(),
                WIDTH/2-70 , WIDTH/2+170 );
        g.drawString(tm.getNowYear() + " " + tm.getNowMonth() + " " + tm.getNowDate(),
                WIDTH/2-140 , WIDTH/2+220 );
        //g.drawString(tm.getNowYear(), WIDTH/2-50 , WIDTH/2+230 );
        g.drawString(Integer.toString(tm.getNowHour())+" : "+Integer.toString(tm.getNowMinute()),
                WIDTH/2-40 , WIDTH/2-230 );
        g.drawString(tm.getNowAm_pm(),
                WIDTH/2-25 , WIDTH/2-190 );

    }


}
