package DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Demo1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
//        LocalDateTime  time = LocalDateTime.now();
//        System.out.println(time);
        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        int yy = date.getYear();
        System.out.println(dd + " - " + mm + " - " + yy);
      LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
            ZoneId zone = ZoneId.systemDefault();
            System.out.println(zone);


    }
}
