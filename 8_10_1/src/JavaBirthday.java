import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class JavaBirthday {

    public String getPeriodFromBirthday(LocalDate birthday){
        LocalDate now = LocalDate.now();
        long birthdayYears = birthday.until(now, ChronoUnit.YEARS);
        long birthdayMonth = birthday.until(now, ChronoUnit.MONTHS) % 12;
        long birthdayDay = birthday.until(now, ChronoUnit.DAYS) -
                (birthdayYears * 365 + getLeapYearsCount(birthdayYears));
        System.out.println(birthdayYears + " years " +
                birthdayMonth + " months " +
                birthdayDay + " days");
        return "";
    }

    private long getLeapYearsCount(long birthdayYears) {
        int currentYear = LocalDate.now().getYear();
        int yearCount = 0;
        for (int i = currentYear; i >= currentYear - birthdayYears; i--){
            if ((i % 400 == 0) || ((i % 4 == 0) && (i % 100 != 0))){
                yearCount++;
            }
        }
        return yearCount;
    }
}
