import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        JavaBirthday javaBirthday = new JavaBirthday();
        System.out.println(javaBirthday.getPeriodFromBirthday(LocalDate.of(2001, 1,11)));
    }
}
