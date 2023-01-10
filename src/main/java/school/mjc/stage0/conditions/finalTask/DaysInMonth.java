package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {

        if (month == 1) {
            System.out.println("31");
        } else if (month == 2) {
            if (isLeapYear(year) == true) {
                System.out.println("29");
            } else {
                System.out.println("28");
            }
        } else if (month == 3) {
            System.out.println("31");
        } else if (month == 4) {
            System.out.println("30");
        } else if (month == 5) {
            System.out.println("31");
        } else if (month == 6) {
            System.out.println("30");
        } else if (month == 7) {
            System.out.println("31");
        } else if (month == 8) {
            System.out.println("31");
        } else if (month == 9) {
            System.out.println("30");
        } else if (month == 10) {
            System.out.println("31");
        } else if (month == 11) {
            System.out.println("30");
        } else if (month == 12) {
            System.out.println("31");
        } else if (year <= 0 || month <= 0 || month >= 13) {
            System.out.println("invalid date");
        }

    }

    public static boolean isLeapYear(int year) {

        int residue = year % 4;

        boolean isLastYearOfCentury = year % 100 == 0;
        boolean isMultipleOf400 = year % 400 == 0;

        switch (residue) {
            default:
                return false;
            case (0):
                if (isLastYearOfCentury == false) {
                    return true;
                } else if (isMultipleOf400 == true) {
                    return true;
                } else {
                    return false;
                }
        }

    }

}
