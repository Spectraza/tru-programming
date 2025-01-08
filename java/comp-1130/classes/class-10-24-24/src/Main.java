public class Main {
    public static void main(String[] args) {
        Payroll emp1 = new Payroll("Drake Aubrey", 1);
        Payroll emp2 = new Payroll("Idris Elba", 2);

        //Sets pay information
        emp1.setHoursWorked(40.5);
        emp1.setPayRate(19.50);

        emp2.setHoursWorked(48.2);
        emp2.setPayRate(25.50);

        //Get employee information
        System.out.println("Employee Name: " + emp1.getName());
        System.out.println("Employee ID Number: " + emp1.getIdNumber());
        System.out.println("Hours Worked: " + emp1.getHoursWorked());
        System.out.println("Pay Rate: " + emp1.getPayRate());
        System.out.println("Gross Pay: " + emp1.getGrossPay());

        System.out.println(" ");

        System.out.println("Employee Name: " + emp2.getName());
        System.out.println("Employee ID Number: " + emp2.getIdNumber());
        System.out.println("Hours Worked: " + emp2.getHoursWorked());
        System.out.println("Pay Rate: " + emp2.getPayRate());
        System.out.println("Gross Pay: " + emp2.getGrossPay());
    }
}