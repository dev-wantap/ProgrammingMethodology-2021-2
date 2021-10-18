import java.time.LocalTime;
import java.util.Calendar;

public class NewTimeManager {
    LocalTime now;
    private int nowHour;
    private int nowMinute;
    private int nowSecond;

    private String nowYear;
    private String nowWeek;
    private String nowMonth;
    private String nowDate;
    private String nowAm_pm;

    public NewTimeManager(LocalTime n) {
        now = n;
    }

    /**
     * reset - 현재 시간을 받아오고 이를 private 변수에 저장하는 역할
     */
    public void reset() {
        nowHour = now.getHour();
        nowMinute = now.getMinute();
        nowSecond = now.getSecond();

        nowYear = "ERROR";
        nowWeek = "ERROR";
        nowMonth = "ERROR";
        nowDate = "ERROR";
        nowAm_pm = "ERROR";

        Calendar cal = Calendar.getInstance();
        nowDate = Integer.toString(cal.get(Calendar.DATE));
        nowYear = Integer.toString(cal.get(Calendar.YEAR));
        switch (cal.get(Calendar.DAY_OF_WEEK)) {
            case 1:	nowWeek = "Sunday";break;
            case 2: nowWeek = "Monday";break;
            case 3: nowWeek = "Tuesday";break;
            case 4: nowWeek = "Wednesday";break;
            case 5: nowWeek = "Thursday";break;
            case 6: nowWeek = "Friday";break;
            case 7: nowWeek = "Saturday";break;
        }
        switch (cal.get(Calendar.MONTH)) {
            case 0: nowMonth = "January";break;
            case 1: nowMonth = "February";break;
            case 2: nowMonth = "March";break;
            case 3: nowMonth = "April";break;
            case 4: nowMonth = "May";break;
            case 5: nowMonth = "June";break;
            case 6: nowMonth = "July";break;
            case 7: nowMonth = "August";break;
            case 8: nowMonth = "September";break;
            case 9: nowMonth = "October";break;
            case 10: nowMonth = "November";break;
            case 11: nowMonth = "December";break;
        }

        switch (cal.get(Calendar.AM_PM)) {
            case 0: nowAm_pm = "am";break;
            case 1: nowAm_pm = "pm";break;
        }

    }
    // 아래 함수들은 private 변수들의 값을 외부에서 불러오는 역할
    public int getNowHour() {
        return nowHour;
    }
    public int getNowMinute() {
        return nowMinute;
    }
    public int getNowSecond() {
        return nowSecond;
    }

    public String getNowYear() {
        return nowYear;
    }
    public String getNowWeek() {
        return nowWeek;
    }
    public String getNowDate() {
        return nowDate;
    }
    public String getNowMonth() {
        return nowMonth;
    }
    public String getNowAm_pm() {
        return nowAm_pm;
    }
}
