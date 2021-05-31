public class Main {

    public static double calculateSalary(double hoursPerWeek,
                                         double amountPerHour,
                                         int vacationDays){

        if(hoursPerWeek < 0){
            return -1;
        }

        if(amountPerHour < 0){
            return -1;
        }
        double weeklyPaycheck = hoursPerWeek * amountPerHour;
        double unPaidTime = vacationDays * amountPerHour * 8;
        return (weeklyPaycheck * 52) - unPaidTime;

    }

    public static void main(String[] args) {
        double salary = calculateSalary(40,15, 8);
        System.out.println(salary);
    }

}
