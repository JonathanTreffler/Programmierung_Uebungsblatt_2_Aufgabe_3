class Aufgabe3 {
    public static void main(String[] args) {
        int day = SimpleIO.getInt("Bitte geben Sie die Tageskomponente des Startdatums ein:");
        int month = SimpleIO.getInt("Bitte geben Sie die Monatskomponente des Startdatums ein:");
        int year = SimpleIO.getInt("Bitte geben Sie die Jahreskomponente des Startdatums ein:");

        int days = SimpleIO.getInt("Bitte geben Sie die Anzahl an Tagen ein");

        if(!Helpers.validDate(day, month, year)) {
            System.out.println("Eingegebenes Datum ungueltig ! Berechnung abgeborchen.");
        } else if(days < 1) {
            System.out.println("Anzahl der Tage ungueltig ! Berechnung abgeborchen.");
        } else {
            Helpers.printDate("Eingegbenes Datum: ", day, month, year);

            DateCalculation calculation = new DateCalculation(day, month, year, days);

            calculation.calculate();
            calculation.printResult();
        }

        

    }

}