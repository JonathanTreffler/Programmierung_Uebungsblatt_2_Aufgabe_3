public class Helpers {
    public static void printDate(String prefix, int day, int month, int year) {
        System.out.println(prefix + day + "." + month + "." + year);
    }
    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    static int[] calculateDaysPerMonth(int year) {
        int[] daysPerMonth;

        if(isLeapYear(year)) {
            daysPerMonth =  new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            //System.out.println("Schaltjahr bei Kalkulation beachtet !");
        }else {
            daysPerMonth =  new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        }

        return daysPerMonth;
    }

    static boolean validDate(int day, int month, int year) {

        int[] daysPerMonth = calculateDaysPerMonth(year);

        if(month < 1 || month > 12) {
            return false;
        } else if(day < 1 || day > daysPerMonth[month-1]) {
            return false;
        }

        return true;
    }
}
