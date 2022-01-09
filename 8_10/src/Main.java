import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int j;
        int currentYear = LocalDate.now().getYear();
        int currentMonth = LocalDate.now().getMonthValue();
        int currentDay = LocalDate.now().getDayOfMonth();
        Scanner in = new Scanner(System.in);
        NumberAndDays numberAndDays = new NumberAndDays();
        System.out.println("Введите дату через пробел:");
        int birthdayDay = in.nextInt();
        int birthdayMonth = in.nextInt();
        int birthdayYear = in.nextInt();
        numberAndDays.collectBirthdays(birthdayYear, birthdayMonth, birthdayDay);
        for (j = 0; j <= 0; j += 0) {
            if (numberAndDays.year > currentYear) {
                System.out.println("Неверный год, введите дату снова:");
                numberAndDays.collectBirthdays(in.nextInt(), in.nextInt(), in.nextInt());
            }
            else if (numberAndDays.year == currentYear &
                    numberAndDays.day == currentDay &
                    numberAndDays.month > currentMonth) {
                System.out.println("Неверный месяц, введите дату снова:");
                numberAndDays.collectBirthdays(in.nextInt(), in.nextInt(), in.nextInt());
            }
            else if (numberAndDays.year == currentYear &
                    numberAndDays.month == currentMonth &
                    numberAndDays.day > currentDay) {
                System.out.println("Неверный день, введите дату снова:");
                numberAndDays.collectBirthdays(in.nextInt(), in.nextInt(), in.nextInt());
            }
            else if(numberAndDays.year == currentYear &
                    (numberAndDays.month > currentMonth ||
            numberAndDays.day > currentDay)){
                System.out.println(("Неверная дата, введите дату снова"));
            numberAndDays.collectBirthdays(in.nextInt(), in.nextInt(), in.nextInt());
            }
            else System.exit(0);

            }
        }
    }

