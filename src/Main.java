public class Main {
    public static void main(String[] args) {
        HandleHoliday handleHoliday = new HandleHoliday();

        handleHoliday.printHoliday("01/01/2023");
        handleHoliday.printHoliday("10/02/2023");

        System.out.println("\n----- All Holidays -----");
        handleHoliday.printHolidays();

    }
}