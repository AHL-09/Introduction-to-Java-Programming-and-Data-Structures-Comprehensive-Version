import java.util.ArrayList;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        ArrayList<Date> dates = new ArrayList();
        dates.add(new Date());
        Date date = (Date) dates.get(0);
    }
}
