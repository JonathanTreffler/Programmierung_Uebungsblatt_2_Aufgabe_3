public class DateCalculation {

    int day, month, year, days;
    
    public DateCalculation(int initDay, int initMonth, int initYear, int initDays) {
            day = initDay;
            month = initMonth;
            year = initYear;

            days = initDays;
    }

    public void calculate() {
        int[] daysPerMonth = Helpers.calculateDaysPerMonth(year);

        for(int i = 0; i < days; i++) {

            day++;

            if(day > daysPerMonth[month-1]) {

                //System.out.println("Day " + day + " out of bounds, incrementing month");

                day = 1;
                month++;
            }

            if(month > 12) {
                
                //System.out.println("Month " + month + " out of bounds, incrementing year");

                month = 1;
                year++;

                daysPerMonth = Helpers.calculateDaysPerMonth(year);
            }
        }
    }

    public void printResult() {
        Helpers.printDate("Ergebnis: ", day, month, year);
    }
}
