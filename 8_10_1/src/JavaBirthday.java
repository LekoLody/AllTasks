import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class JavaBirthday {

    public String getPeriodFromBirthday(LocalDate birthday){
        LocalDate now = LocalDate.now();
        long birthdayYears = birthday.until(now, ChronoUnit.YEARS);
        long birthdayMonth = birthday.until(now, ChronoUnit.MONTHS) % 12;
        long birthdayDay = (birthday.until(now, ChronoUnit.DAYS) -
                (birthday.until(now, ChronoUnit.YEARS) * 365 + birthdayYears / 4) - 1) % 365;
        System.out.println(birthdayYears + " years " +
                birthdayMonth + " months " +
                birthdayDay + " days");
        return "";
    }
}
