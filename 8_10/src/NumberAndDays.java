import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NumberAndDays {
    public int year;
    public int month;
    public int day;

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }



    public int getYear() {
        return year;
    }


    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    public String collectBirthdays(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        formatter.format(today);
        for (int i = 0; i <= today.getYear() - year; i++) {
            if (birthday.isBefore(today)) {
                System.out.println(i + " - " + formatter.format(birthday)+ " - " + birthday.getDayOfWeek());
                birthday = birthday.plusYears(1);
            } else if (birthday.isAfter(today)) {
                System.out.println("Ваш возраст: " + (i - 1));
            }
        }
        return "";
    }
}
