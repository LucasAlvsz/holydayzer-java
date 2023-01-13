import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Holiday> holidays = new ArrayList<>();
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

        HandleHoliday handleHoliday = new HandleHoliday(holidays);

        handleHoliday.printHoliday("01/01/2023");
        handleHoliday.printHoliday("10/02/2023");

        System.out.println("\n----- All Holidays -----");
        handleHoliday.printHolidays();


    }
}