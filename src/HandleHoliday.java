import java.util.ArrayList;
import java.util.List;
public class HandleHoliday {
    private final List<Holiday> holidays = new ArrayList<>();

    public HandleHoliday(){
        mountHolidays();
    }
    public void mountHolidays() {
        holidays.add(new Holiday("New Year's Day", "01/01/2023"));
        holidays.add(new Holiday("Valentine's Day", "14/02/2023"));
        holidays.add(new Holiday("Carnival", "21/02/2023"));
        holidays.add(new Holiday("Tiradentes", "21/04/2023"));
        holidays.add(new Holiday("Labor Day", "01/05/2023"));
        holidays.add(new Holiday("Corpus Christi", "08/06/2023"));
        holidays.add(new Holiday("Independence Day Of Brazil", "07/09/2023"));
        holidays.add(new Holiday("Our Lady Of Aparecida", "12/10/2023"));
        holidays.add(new Holiday("All Souls' Day", "02/11/2023"));
        holidays.add(new Holiday("Republic Day Of Brazil", "15/11/2023"));
        holidays.add(new Holiday("Christmas", "25/12/2023"));
    }

    public void printHolidays() {
        for (Holiday holiday : holidays)
            System.out.println(holiday.name() + " - " + holiday.date());
    }

    public void printHoliday(String date) {
        for (Holiday holiday : holidays) {
            if (holiday.date().equals(date)) {
                System.out.println(holiday.name() + " - " + holiday.date());
                return;
            }
        }

        System.out.println("No holiday found for: " + date + ".");

    }
}
