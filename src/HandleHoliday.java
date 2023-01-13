import java.util.List;
public class HandleHoliday {
    private List<Holiday> holidays;

    public HandleHoliday(List<Holiday> holidays) {
        this.holidays = holidays;
    }

    public void printHolidays() {
        for (Holiday holiday : holidays)
            System.out.println(holiday.getName() + " - " + holiday.getDate());
    }

    public void printHoliday(String date) {
        for (Holiday holiday : holidays) {
            if (holiday.getDate().equals(date)) {
                System.out.println(holiday.getName() + " - " + holiday.getDate());
                return;
            }
        }

        System.out.println("No holiday found for: " + date + ".");

    }
}
